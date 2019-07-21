package com.joser.bankservice;

public class Teller {

    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, int amount) {
        account.debit(amount);
        this.cashSlot.dispense(amount);
    }
}
