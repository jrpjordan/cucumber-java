package com.joser;

public class ChekcoutImpl implements Checkout {

    private Integer runningTotal = 0;

    @Override
    public void add(int count, int price) {
        runningTotal += runningTotal + (count * price);
    }

    @Override
    public Integer total() {
        return this.runningTotal;
    }

}
