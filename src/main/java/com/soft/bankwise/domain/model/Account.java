package com.soft.bankwise.domain.model;

public class Account {


    private Long id;
    private User user;
    private Double balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    void deposit(double valor){
        if (valor > 0){
            this.balance += valor;
        }
    }

    void withdraw(double valor){
        if (valor > 0){
            if (valor >= this.balance){
                this.balance -= valor;
            }
        }
    }
}