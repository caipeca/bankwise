package com.soft.bankwise.infrastructure.persistence.repository;

import com.soft.bankwise.infrastructure.persistence.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
