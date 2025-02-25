package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", monochrome = true, dryRun = false,
        tags = "@PIM or @Dashboard or @ValidLogin or @InvalidLogin",
        plugin = {"html:target/cucumber.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber.extent",
                "rerun:target/failed_scenarios.txt"})


public class TestNGTestRunner extends AbstractTestNGCucumberTests
{
    // run all test parallel
    /*@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }*/
}
