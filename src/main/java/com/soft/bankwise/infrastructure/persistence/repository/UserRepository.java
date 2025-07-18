package com.soft.bankwise.infrastructure.persistence.repository;

import com.soft.bankwise.infrastructure.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
