package com.joser.steps;

import com.joser.helper.KnowsTheDomain;
import io.cucumber.java.en.When;

import javax.naming.OperationNotSupportedException;

public class TellerSteps {

    private KnowsTheDomain helper;

    public TellerSteps() {
        this.helper = KnowsTheDomain.getInstance();
    }

    @When("I withdraw ${int}")
    public void i_requested_$(Integer requested) throws OperationNotSupportedException {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), requested);
    }

}
