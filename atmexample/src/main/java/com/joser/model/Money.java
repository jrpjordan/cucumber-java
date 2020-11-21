package com.joser.model;

import javax.naming.OperationNotSupportedException;

public class Money {

    private Integer dollars = 0;
    private Integer cents = 0;

    public Money (String amount) {
        this.dollars = parseDollars(amount);
        this.cents = parseCents(amount);
    }

    public Money() {}

    public Money add(Money money) {
        dollars += money.getDollars();
        cents += money.getCents();
        money.updateCents();
        return this;
    }

    public Money substract(Money money) throws OperationNotSupportedException {
        if (money.getDollars() > this.getDollars())
            throw new OperationNotSupportedException("Not enough Money bitch");
        this.dollars -= money.getDollars();
        return this;
    }

    private Integer parseDollars(String amount) {
        int indexDecimal = amount.indexOf(".");
        return Integer.parseInt(amount.substring(0, indexDecimal));
    }

    private Integer parseCents(String amount) {
        int indexDecimal = amount.indexOf(".");
        return Integer.parseInt(amount.substring(indexDecimal+1));
    }

    public Integer getDollars() {
        return this.dollars;
    }

    public Integer getCents() {
        return this.cents;
    }

    private Money updateCents() {
        this.dollars += this.cents / 100;
        this.cents = this.cents % 100;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        return   o instanceof com.joser.model.Money
                && ((Money) o).getCents().equals(this.getCents())
                && ((Money) o).getDollars().equals(this.getDollars()) ;
    }
}
