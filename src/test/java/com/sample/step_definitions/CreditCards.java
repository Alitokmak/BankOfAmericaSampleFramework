package com.sample.step_definitions;

import com.sample.pages.creditCards.creditCardsOptions.CreditCardsOptions;
import com.sample.utilities.BrowserUtils;
import com.sample.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreditCards {
    CreditCardsOptions creditCardsOptions=new CreditCardsOptions();

    @Given("User click to credit card button")
    public void user_click_to_credit_card_button() {
        creditCardsOptions.creditCardsButton.click();
    }

    @Then("verify that all credit cards options")
    public void verify_that_all_credit_cards_options(List<String> dataTable) {
        for (String each : dataTable) {
            BrowserUtils.getTextElements(each);
        }
//        int i = 0;
//        for (WebElement each : creditCardsOptions.cashRewardsCards) {
//            System.out.println(each.getText());
//            Assert.assertEquals(dataTable.get(i), each.getText());
//            i += 1;
//        }

    }
}
