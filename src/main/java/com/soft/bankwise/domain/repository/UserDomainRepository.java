package com.soft.bankwise.domain.repository;

import com.soft.bankwise.domain.model.User;
import org.springframework.stereotype.Repository;


public interface UserDomainRepository {
    User findById(Long id);
    void save(User user);
}
