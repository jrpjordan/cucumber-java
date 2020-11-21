package com.joser.model;

import javax.naming.OperationNotSupportedException;

public class AutomatedTeller implements Teller {

    private CashSlot cashSlot;

    public AutomatedTeller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, Integer dollars) throws OperationNotSupportedException {
        account.debit(dollars);
        cashSlot.dispense(dollars);
    }
}
