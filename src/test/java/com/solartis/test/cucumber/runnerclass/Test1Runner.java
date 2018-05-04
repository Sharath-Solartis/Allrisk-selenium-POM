package com.solartis.test.cucumber.runnerclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "html:target/site/cucumber-pretty","json:target/cucumber1.json" }, 
        glue = "com.solartis.test.cucumber.stepdefenitions",
        features = {"src/main/java/com/solartis/test/cucumber/featureFiles/HODP.feature"},
        monochrome = true, 
        strict = true,
        dryRun = false,
        tags = {"@Scenario710"}      
)

public class Test1Runner
{
	
}