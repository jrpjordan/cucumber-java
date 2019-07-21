package com.joser;

import com.joser.domain.Money;
import com.joser.support.KnowsMyAccount;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

public class AccountSteps {

    private KnowsMyAccount helper;

    public AccountSteps(KnowsMyAccount helper) {
        this.helper = helper;
    }

    @Given("I have deposited ${money} in my account")
    public void iHaveDepositedInMyAccount(Money amount) {
        helper.getMyAccount().deposit(amount);
        assertEquals(amount.getCents(), helper.getMyAccount().getBalance().getCents());
        assertEquals(amount.getDollars(), helper.getMyAccount().getBalance().getDollars());
    }
}
