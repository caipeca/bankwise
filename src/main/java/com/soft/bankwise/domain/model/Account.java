package com.soft.bankwise.domain.model;

public class Account {


    private Long id;
    private User user;
    private Double balance;

    public Account() {
    }

    public Account(Long id, User user, Double balance) {
        this.id = id;
        this.user = user;
        this.balance = balance;
    }

    public Account(User user, Double balance) {
        this.user = user;
        this.balance = balance;
    }

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

    public void deposit(double valor){
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