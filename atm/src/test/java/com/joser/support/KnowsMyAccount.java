package com.joser;

import com.joser.bankservice.Account;
import com.joser.bankservice.CashSlot;

public class KnowsMyAccount {
    private Account myAccount;
    private CashSlot cashSlot;

    public Account getMyAccount() {
        if (this.myAccount == null) {
            this.myAccount = new Account();
        }
        return this.myAccount;
    }

    public CashSlot getCashSlot() {
        if (this.cashSlot == null) {
            this.cashSlot = new CashSlot();
        }
        return cashSlot;
    }
}