package com.cybertek.library.step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Going to login page");
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException(); it will skip the rests
        //of the tests & will fail. Order matters because if something fails everything
        //else fails
        System.out.println("Logging in as a librarian");
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Verifying dashboard page");
    }
    @When("I login as a student")
    public void i_login_as_a_student() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Logging in as a student");
    }

}
