package com.sample.pages.login;

import com.sample.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
