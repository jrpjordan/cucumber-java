package com.joser.steps;

import com.joser.helper.KnowsTheDomain;
import com.joser.model.Money;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class AccountSteps {

    private KnowsTheDomain helper;

    public AccountSteps() {
        this.helper = KnowsTheDomain.getInstance();
    }

    @ParameterType(".*")
    public Money money(String amount) {
        return new Money(amount);
    }

    @Given("my account has been credited with ${money}")
    public void i_have_deposited_$_in_my_account(Money money) {
        helper.getMyAccount().credit(money);
        assertEquals("Incorrect account balance -", money, helper.getMyAccount().getBalance());
    }

    @Then("the balance of my account should be ${money}")
    public void the_balance_of_my_account_should_be_$(Money money) {
        assertEquals("Incorrect account balance -", money, helper.getMyAccount().getBalance());
    }


}
