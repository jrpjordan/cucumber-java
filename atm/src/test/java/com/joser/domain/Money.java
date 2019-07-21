package com.joser;

public class Money {

    private int dollars = 0;
    private int cents = 0;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money() {}

    public Money add(Money money) {
        int totalCents = this.getCents() + money.getCents();
        this.cents = (totalCents > 99)
                ?  totalCents - ((int)totalCents/100)*100
                : totalCents;

        this.dollars += money.getDollars() + totalCents/100;
        this.cents += money.getCents();
        return this;
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }
}
