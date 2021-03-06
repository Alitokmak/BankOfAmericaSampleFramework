package com.sample.pages.creditCards.creditCardsOptions;

import com.sample.pages.login.BasePage;
import com.sample.utilities.BrowserUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreditCardsOptions extends BasePage {

    @FindBy(id="navCreditCards")
    public WebElement creditCardsButton;

    @FindBy(xpath="//*[@id=\"navCreditCardsContent\"]/div[2]/div[1]/div[1]/div[1]/div[2]/ul")
    public List<WebElement> cashRewardsCards;

    public List<String> getColumnNames() {
        return BrowserUtils.getListOfString(cashRewardsCards);
    }
}


