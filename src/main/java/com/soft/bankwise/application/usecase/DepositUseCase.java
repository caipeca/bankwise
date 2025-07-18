package com.soft.bankwise.application.usecase;

import com.soft.bankwise.application.dto.input.DepositInput;
import com.soft.bankwise.application.dto.output.DepositOutput;
import com.soft.bankwise.domain.model.Account;
import com.soft.bankwise.domain.repository.AccountDomainRepository;

public class DepositUseCase {

    private final AccountDomainRepository accountDomainRepository;

    public DepositUseCase(AccountDomainRepository accountDomainRepository) {
        this.accountDomainRepository = accountDomainRepository;
    }


    public DepositOutput execute(DepositInput input) {
        Account account = accountDomainRepository.findByID(input.getAccountId());
        account.deposit(input.getDepositAmount());
        accountDomainRepository.save(account);
        DepositOutput output = new DepositOutput();
        output.setAmount(account.getBalance());
        output.setDescription("Deposit successful");
        return output;
    }
}
