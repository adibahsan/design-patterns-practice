package com.adibahsan.classes;

public class Accounts {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance>0)
        this.balance = balance;
    }
}
