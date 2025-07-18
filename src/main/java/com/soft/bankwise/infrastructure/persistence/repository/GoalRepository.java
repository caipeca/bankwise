package com.soft.bankwise.infrastructure.persistence.repository;

import com.soft.bankwise.infrastructure.persistence.entity.GoalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<GoalEntity, Long> {
}
