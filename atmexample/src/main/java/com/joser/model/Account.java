package com.joser.model;

import javax.naming.OperationNotSupportedException;

public class Account {

    private Money balance = new Money();

    public void credit(Money amount) {
        balance = balance.add(amount);
    }

    public Money getBalance() {
        return balance;
    }

    public void debit(Integer dollars) throws OperationNotSupportedException {
        Money money = new Money(String.valueOf(dollars) + ".00");
        balance.substract(money);
    }
}
