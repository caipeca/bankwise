package com.soft.bankwise.domain.model;

import jakarta.persistence.*;

@Entity
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false )
    private UserModel user;

    private Double balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
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
