package com.soft.bankwise.infrastructure.persistence.repository;

import com.soft.bankwise.infrastructure.persistence.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}
