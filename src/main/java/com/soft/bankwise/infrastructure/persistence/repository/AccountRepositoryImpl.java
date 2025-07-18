package com.soft.bankwise.infrastructure.persistence.repository;

import com.soft.bankwise.domain.model.Account;
import com.soft.bankwise.domain.repository.AccountDomainRepository;
import com.soft.bankwise.infrastructure.persistence.entity.AccountEntity;
import com.soft.bankwise.utils.mapper.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountDomainRepository {
    private final AccountRepository accountRepository;
    private final Mapper mapper;

    public AccountRepositoryImpl(AccountRepository accountRepository, Mapper mapper) {
        this.accountRepository = accountRepository;
        this.mapper = mapper;
    }


    @Override
    public Account findByID(long id) {
        return accountRepository.findById(id).map(mapper::toAccountDomain).orElse(null);
    }

    @Override
    public Account save(Account account) {
        AccountEntity entity = mapper.toAccountEntity(account);
        accountRepository.save(entity);
        return mapper.toAccountDomain(entity);
    }
}
