package com.soft.bankwise.utils.mapper;

import com.soft.bankwise.application.dto.input.CreateAccountInput;
import com.soft.bankwise.application.dto.output.AccountOutput;
import com.soft.bankwise.domain.model.Account;
import com.soft.bankwise.domain.model.User;
import com.soft.bankwise.infrastructure.persistence.entity.AccountEntity;
import com.soft.bankwise.infrastructure.persistence.entity.UserEntity;
import com.soft.bankwise.web.dto.request.CreateAccountRequest;
import com.soft.bankwise.web.dto.response.AccountResponse;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public AccountEntity toAccountEntity(Account account){
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setId(account.getId());
        accountEntity.setBalance(account.getBalance());
        return accountEntity;
    }

    public Account toAccountDomain(AccountEntity accountEntity){
        Account account = new Account();
        account.setId(accountEntity.getId());
        account.setBalance(accountEntity.getBalance());
        return account;
    }

    public CreateAccountRequest toCreateAccountRequest(CreateAccountInput account){
        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
        createAccountRequest.setUserId(account.getUserId());
        createAccountRequest.setInitialDeposit(account.getBalance());
        return createAccountRequest;

    }

    public CreateAccountInput toCreateAccountInput(CreateAccountRequest account){
        CreateAccountInput createAccountInput = new CreateAccountInput();
        createAccountInput.setBalance(account.getInitialDeposit());
        createAccountInput.setUserId(account.getUserId());
        return createAccountInput;
    }

    public AccountOutput toAccountOutput(AccountResponse accountResponse){
         AccountOutput accountOutput = new AccountOutput();
         accountOutput.setBalance(accountResponse.getBalance());
         accountOutput.setAccountId(accountResponse.getAccountId());
         accountOutput.setStatus(accountResponse.getStatus());
         return accountOutput;
    }

    public AccountResponse toAccountResponse(AccountOutput accountOutput){
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setBalance(accountOutput.getBalance());
        accountResponse.setAccountId(accountOutput.getAccountId());
        accountResponse.setStatus(accountOutput.getStatus());
        return accountResponse;
    }

    public User toUser(UserEntity userEntity){
        User user = new User();
        user.setId(userEntity.getId());
        user.setUsername(userEntity.getUsername());
        user.setPassword(userEntity.getPassword());
        return user;
    }
}
