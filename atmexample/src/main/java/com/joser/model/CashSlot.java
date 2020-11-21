package com.joser.model;

public class CashSlot {

    private Integer contents;

    public Integer getContents() {
        return contents;
    }

    public void dispense(int dollars) {
        contents = dollars;
    }
}
