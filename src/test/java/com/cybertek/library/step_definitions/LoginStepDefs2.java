package com.cybertek.library.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs2 {
    @When("I enter username {string}")
    public void i_enter_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Enter username: " + username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Enter password: "+ password);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Clicking on sign in");
    }

    @Then("there should be {int} users")
    public void there_should_be_users(Integer count) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Verifying user count: "+ count);
    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Logging in using "+ username + " and "+ password);
    }
    @Then("there should be {int} {string}")
    public void there_should_be(Integer count, String type) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        System.out.println("Verifying "+ count+ " "+type);

    }
}
