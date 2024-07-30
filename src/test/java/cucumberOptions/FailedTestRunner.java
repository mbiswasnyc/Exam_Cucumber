package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

//html, xml, json, junit
//extent
@CucumberOptions(features = "@target/failed_scenarios.txt", glue = "stepDefinitions",
        monochrome = true, plugin = {"html:target/cucumber.html", "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber.extent"})                        // tags = "@PlaceOrder"         dryRun = false

public class FailedTestRunner extends AbstractTestNGCucumberTests
{
    /*@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){                  // run all test parallel
        return super.scenarios();
    }*/
}