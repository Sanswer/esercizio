package com.fabrick.esercizio.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Account {

    @Id
    private static Long accountId= 1453778014537780L;
    private String iban;
    private String abuCode;
    private String cabCode;
    private String countryCode;
    private String internationalCin;
    private String nationalCin;
    private String account;
    private String alias;
    private String productName;
    private String holderName;
    private Date activatedDate;
    private String currency;
    /*
    accountId
String
The ID of the account.
iban
String
The IBAN code of the account.
abiCode
String
The abiCode code of the account.
cabCode
String
The cabCode code of the account.
countryCode
String
The countryCode code of the account.
internationalCin
String
The internationalCin code of the account.
nationalCin
String
The nationalCin code of the account.
account
String
The account number. Substring of IBAN code.
alias
String
The alias of the account, if any.
productName
String
The account product name.
holderName
String
The full name (or names) of the account holder (or holders).
activatedDate
Date
The date on which the account was activated.
currency
String
The native currency of the account
     */

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", abuCode='" + abuCode + '\'' +
                ", cabCode='" + cabCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", internationalCin='" + internationalCin + '\'' +
                ", nationalCin='" + nationalCin + '\'' +
                ", account='" + account + '\'' +
                ", alias='" + alias + '\'' +
                ", productName='" + productName + '\'' +
                ", holderName='" + holderName + '\'' +
                ", activatedDate=" + activatedDate +
                ", currency='" + currency + '\'' +
                '}';
    }

    public static Long getAccountId() {
        return accountId;
    }

    public static void setAccountId(Long accountId) {
        Account.accountId = accountId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getAbuCode() {
        return abuCode;
    }

    public void setAbuCode(String abuCode) {
        this.abuCode = abuCode;
    }

    public String getCabCode() {
        return cabCode;
    }

    public void setCabCode(String cabCode) {
        this.cabCode = cabCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getInternationalCin() {
        return internationalCin;
    }

    public void setInternationalCin(String internationalCin) {
        this.internationalCin = internationalCin;
    }

    public String getNationalCin() {
        return nationalCin;
    }

    public void setNationalCin(String nationalCin) {
        this.nationalCin = nationalCin;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Date getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(Date activatedDate) {
        this.activatedDate = activatedDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
