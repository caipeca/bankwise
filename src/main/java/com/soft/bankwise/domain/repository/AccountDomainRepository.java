package com.soft.bankwise.domain.repository;

import com.soft.bankwise.domain.model.Account;

public interface AccountDomainRepository {
    Account findByID(long id);
    void save(Account account);
}
