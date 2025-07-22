package com.soft.bankwise.infrastructure.configuration;

import com.soft.bankwise.domain.repository.AccountDomainRepository;
import com.soft.bankwise.infrastructure.persistence.repository.AccountRepository;
import com.soft.bankwise.infrastructure.persistence.repository.AccountRepositoryImpl;
import com.soft.bankwise.utils.mapper.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public AccountDomainRepository accountDomainRepository(
            AccountRepository jpaAccountRepository,
            Mapper mapper) {
        return new AccountRepositoryImpl(jpaAccountRepository, mapper);
    }
}