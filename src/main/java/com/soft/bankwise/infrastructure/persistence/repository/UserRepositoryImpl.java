package com.soft.bankwise.infrastructure.persistence.repository;

import com.soft.bankwise.domain.model.User;
import com.soft.bankwise.domain.repository.UserDomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserDomainRepository {
    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void save(User user) {

    }
}
