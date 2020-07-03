package com.sample.step_definitions;

import com.sample.pages.creditCards.creditCardsOptions.CashRewardsCreditCards;
import com.sample.pages.creditCards.creditCardsOptions.CreditCardsOptions;
import com.sample.utilities.BrowserUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CashRewardsCreditCardsApplyStepDefiniton {
    CashRewardsCreditCards cashRewardsCreditCards=new CashRewardsCreditCards();

    @Given("User click to Cash Rewards Credit Card button")
    public void user_click_to_Cash_Rewards_Credit_Card_button() {
        cashRewardsCreditCards.cashRewardsCards.click();
    }

    @Then("User click to Apply Now button")
    public void user_click_to_Apply_Now_button() throws InterruptedException {
        BrowserUtils.scrollDown(cashRewardsCreditCards.applyNow);
        BrowserUtils.waitForClickablility(cashRewardsCreditCards.applyNow, 10);
        //cashRewardsCreditCards.applyNow.click();
        BrowserUtils.clickWithJS(cashRewardsCreditCards.applyNow);
    }

    @Then("User fill out information side")
    public void user_fill_out_information_side() throws InterruptedException {
       cashRewardsCreditCards.customerInformation();
       Thread.sleep(3000);
    }

    @When("User click Save and Continue button")
    public void user_click_Save_and_Continue_button() {
       cashRewardsCreditCards.saveContinue.click();
    }

    @Then("User verify that display Submit my Application")
    public void user_verify_that_display_Submit_my_Application() {
        String expected ="Submit my application";
        String actual=cashRewardsCreditCards.submitMyApp.getText();
        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }
}
