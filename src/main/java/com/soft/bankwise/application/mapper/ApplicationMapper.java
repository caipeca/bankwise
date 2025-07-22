package com.soft.bankwise.application.mapper;

import com.soft.bankwise.application.dto.output.AccountOutput;
import com.soft.bankwise.domain.model.Account;
import org.springframework.stereotype.Component;

@Component
public class ApplicationMapper {

    public AccountOutput toOutput(Account account) {
        AccountOutput output = new AccountOutput();
        output.setAccountId(account.getId());
        output.setBalance(account.getBalance());
        return output;

    }

    public Account toAccount(AccountOutput output) {
        Account account = new Account();
        account.setId(output.getAccountId());
        account.setBalance(output.getBalance());
        return account;
    }
}
