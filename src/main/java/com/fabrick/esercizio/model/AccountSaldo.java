package com.fabrick.esercizio.model;

import java.util.Date;

public class AccountSaldo {

    private String accountId;
    private Date date;
    private double balance;
    private double availableBalance;
    private String currency;

    public AccountSaldo() {
    }

    @Override
    public String toString() {
        return "AccountSaldo{" +
                "accountId='" + accountId + '\'' +
                ", date=" + date +
                ", balance=" + balance +
                ", availableBalance=" + availableBalance +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
