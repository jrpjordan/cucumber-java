package com.joser.steps;

import com.joser.helper.KnowsTheDomain;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CashSlotSteps {

    private KnowsTheDomain helper;

    public CashSlotSteps() {
        this.helper = KnowsTheDomain.getInstance();
    }

    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer dispensed) {
        assertEquals("Incorrect amount dispensed -", dispensed, helper.getCashSlot().getContents());
    }
}
