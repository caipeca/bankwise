package com.soft.bankwise.infrastructure.persistence.repository;

import com.soft.bankwise.domain.model.Account;
import com.soft.bankwise.domain.repository.AccountDomainRepository;
import com.soft.bankwise.infrastructure.persistence.entity.AccountEntity;
import com.soft.bankwise.utils.mapper.Mapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountDomainRepository {

    private final AccountRepository jpaAccountRepository; // JPA Repository interface
    private final Mapper mapper;

    // Garanta que o construtor só receba dependências externas
    @Lazy
    public AccountRepositoryImpl(AccountRepository jpaAccountRepository,
                                 Mapper mapper) {
        this.jpaAccountRepository = jpaAccountRepository;
        this.mapper = mapper;
    }

    @Override
    public Account save(Account account) {
        AccountEntity entity = mapper.toAccountEntity(account);
        AccountEntity savedEntity = jpaAccountRepository.save(entity);
        return mapper.toAccountDomain(savedEntity);
    }

    @Override
    public Account findByID(long id) {
        return jpaAccountRepository.findById(id)
                .map(mapper::toAccountDomain)
                .orElse(null);
    }
}
