package com.soft.bankwise.application.dto.input;

import java.math.BigDecimal;

public class TransferFundInput {
    private Long accountOrigin;
    private Long accountDestination;
    private Double amount;

    public Long getAccountOrigin() {
        return accountOrigin;
    }

    public void setAccountOrigin(Long accountOrigin) {
        this.accountOrigin = accountOrigin;
    }

    public Long getAccountDestination() {
        return accountDestination;
    }

    public void setAccountDestination(Long accountDestination) {
        this.accountDestination = accountDestination;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
