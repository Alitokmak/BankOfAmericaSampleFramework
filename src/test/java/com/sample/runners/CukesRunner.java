package com.sample.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
        tags = {"@Cash_Rewards_Credit_Cards_Apply"},
        features = {"src/test/resources/features"
        },
        glue = {"com/sample/step_definitions"},
        dryRun = false

)
public class CukesRunner{

}