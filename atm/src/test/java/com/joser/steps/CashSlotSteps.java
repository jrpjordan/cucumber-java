package com.joser;

import com.joser.support.KnowsMyAccount;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CashSlotSteps {

    private KnowsMyAccount helper;

    public CashSlotSteps(KnowsMyAccount helper) {
        this.helper = helper;
    }

    @Then("${int} should be dispensed")
    public void shouldBeDispensed(int dollars) {
        assertEquals(dollars, helper.getCashSlot().contents());
    }
}
