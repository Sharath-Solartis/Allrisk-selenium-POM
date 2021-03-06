package com.solartis.test.cucumber.runnerclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		 plugin = { "html:target/site/cucumber-pretty","json:target/cucumber3.json" }, 
	        glue = "com.solartis.test.cucumber.stepdefenitions",
	        features = {"src/main/java/com/solartis/test/cucumber/FeatureFiles/BaseRateCheck.feature" },
	        monochrome = true, 
	        strict = true,
	        dryRun = false,
            tags = {"@Third"}
)

public class Test3Runnerr
{
}