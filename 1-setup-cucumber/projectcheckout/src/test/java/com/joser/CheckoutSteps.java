package com.joser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CheckoutSteps {

    private int bananaPrice = 0;
    private Checkout checkout;

    @Given("the price of a {string} is {int}c")
    public void the_price_of_a_is(String item, Integer price) {
        // Write code here that turns the phrase above into concrete actions
        bananaPrice = price;
    }

    @When("I check out {int} {string}")
    public void i_check_out(Integer numberItems, String item) {
        // Write code here that turns the phrase above into concrete actions
        checkout = new ChekcoutImpl();
        checkout.add(numberItems, bananaPrice);
    }

    @Then("the total price should be {int}c")
    public void the_total_price_should_be(Integer price) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(price, checkout.total());
    }

}
