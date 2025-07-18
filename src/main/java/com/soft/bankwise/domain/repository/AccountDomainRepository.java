package com.soft.bankwise.domain.repository;

import com.soft.bankwise.domain.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDomainRepository {
    Account findByID(long id);
    Account save(Account account);
}
