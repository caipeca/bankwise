package com.soft.bankwise.web.dto.request;

import java.math.BigDecimal;

public class WithdrawRequest {
    BigDecimal amount;
    String reason;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
