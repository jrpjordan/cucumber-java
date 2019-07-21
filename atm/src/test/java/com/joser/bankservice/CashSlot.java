package com.joser;

public class CashSlot {

    private int contents;

    public int contents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }
}
