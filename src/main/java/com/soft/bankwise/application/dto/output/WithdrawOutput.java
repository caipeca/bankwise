package com.soft.bankwise.application.dto.output;

public class WithdrawOutput {
    private Double amount;
    private boolean confirm;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }
}
