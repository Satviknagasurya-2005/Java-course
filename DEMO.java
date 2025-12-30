package com.testing.Bank;
public class BankOp;
    int balance=5000;
    public int deposit(int amount)
    {
        balance=balance+amount;
        return balance;
    }
    public int withdraw(int amount)
    {
        balance=balance-amount;
        return balance;
    }