package com.sample.step_definitions;

import com.sample.utilities.ConfigurationReader;
import com.sample.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition {

    @Given("User login on the page")
    public void user_login_on_the_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("verify that page title {string}")
    public void verify_that_page_title(String string) {
        String expected="Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
        String actual=Driver.getDriver().getTitle();
        System.out.println(actual);
    }
}
