package com.soft.bankwise.web.dto.request;

import java.math.BigDecimal;

public class DepositRequest {
    BigDecimal amount;
    String source;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
