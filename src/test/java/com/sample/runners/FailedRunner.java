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
        features = {"@target/rerun.txt"
        },
        glue = {"com/sample/step_definitions"},
        dryRun = false

)
public class FailedRunner {
}
