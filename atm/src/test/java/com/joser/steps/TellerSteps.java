package com.joser;

import com.joser.bankservice.Teller;
import com.joser.support.KnowsMyAccount;
import cucumber.api.java.en.When;

public class TellerSteps {

    private KnowsMyAccount helper;

    public TellerSteps(KnowsMyAccount helper) {
        this.helper = helper;
    }

    @When("I request ${int}")
    public void iRequest(Integer amount) {
        Teller teller = new Teller(helper.getCashSlot());
        teller.withdrawFrom(helper.getMyAccount(), amount);
    }
}
