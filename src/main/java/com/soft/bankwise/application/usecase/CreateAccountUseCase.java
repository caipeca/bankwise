package com.soft.bankwise.application.usecase;

import com.soft.bankwise.application.dto.input.CreateAccountInput;
import com.soft.bankwise.application.dto.output.AccountOutput;
import com.soft.bankwise.application.mapper.ApplicationMapper;
import com.soft.bankwise.domain.model.Account;
import com.soft.bankwise.domain.model.User;
import com.soft.bankwise.domain.repository.AccountDomainRepository;
import com.soft.bankwise.domain.repository.UserDomainRepository;
import com.soft.bankwise.web.dto.request.CreateAccountRequest;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CreateAccountUseCase {

    private final AccountDomainRepository accountDomainRepository;
    private final UserDomainRepository userDomainRepository;
    private final ApplicationMapper applicationMapper;

    public CreateAccountUseCase(@Lazy AccountDomainRepository accountDomainRepository,
                                UserDomainRepository userDomainRepository,
                                ApplicationMapper applicationMapper) {
        this.accountDomainRepository = accountDomainRepository;
        this.userDomainRepository = userDomainRepository;
        this.applicationMapper = applicationMapper;
    }

    public AccountOutput execute(CreateAccountInput input) {
        User user = userDomainRepository.findById(input.getUserId());
        Account account = new Account(user, input.getBalance());
        Account saved = accountDomainRepository.save(account);
        return applicationMapper.toOutput(saved);
    }
}
