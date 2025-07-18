package com.soft.bankwise.application.dto.output;

import java.util.Date;
import java.util.List;

public class GetAccountStatementOutput {
    private Date date;
    private String type;
    private Double amount;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
