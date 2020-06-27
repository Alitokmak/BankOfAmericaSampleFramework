package com.sample.step_definitions;

import com.sample.utilities.ConfigurationReader;
import com.sample.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setup(Scenario scenario){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot=(TakesScreenshot) Driver.getDriver();
            byte[] image =takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image, "image/png");
        }
        Driver.closeDriver();
    }
}
