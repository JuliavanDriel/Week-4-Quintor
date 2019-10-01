package com.example.demo;


import javax.persistence.*;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "AccountId")
    private Long AccountID;

    @Column(name = "Balance")
    private double balance;

    @ManyToOne
    @JoinColumn(name = "holderID")
    private Klanten holder;

    @ManyToOne
    @JoinColumn(name = "medewerkerId")
    private Medewerkers manager;

    public Long getAccountID() {
        return AccountID;
    }

    public void setAccountID(Long accountID) {
        AccountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

