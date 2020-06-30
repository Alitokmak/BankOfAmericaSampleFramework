package com.sample.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserUtils {

    public static void getTextElements(String name){
        WebElement documentExternal = Driver.getDriver().findElement(By.xpath("[title='" + name + "']"));
        Assert.assertTrue(documentExternal.isDisplayed());
        System.out.println(documentExternal.getText());
    }
}
