package com.soft.bankwise.infrastructure.persistence.mapper;

import com.soft.bankwise.domain.model.Account;
import com.soft.bankwise.infrastructure.persistence.entity.AccountEntity;

public class AccountMapper {

    AccountEntity toEntity(Account domain){
        AccountEntity entity = new AccountEntity();
        entity.setId(domain.getId());
        entity.setBalance(domain.getBalance());
        return entity;
    }

    Account toDomain(AccountEntity entity){
        Account domain = new Account();
        domain.setId(entity.getId());
        domain.setBalance(entity.getBalance());
        return domain;
    }
}
