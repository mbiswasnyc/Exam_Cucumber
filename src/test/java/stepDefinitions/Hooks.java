package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.TestContextSetup;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Hooks {
    public TestContextSetup testContextSetup;
    public Logger log;
    public Hooks(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.log = LogManager.getLogger(this.getClass().getName()); // added for log
    }

    @After
    public void afterScenario() throws IOException {
        testContextSetup.testBase.WebDriverManager().quit();
    }
    @AfterStep
    public void addScreenShot(Scenario scenario) throws IOException {
        WebDriver driver = testContextSetup.testBase.WebDriverManager();
        if (scenario.isFailed())
        {
            File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte [] fileContent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileContent, "image/png", "image");
            log.info("........:::::::: Screenshot is generated ::::::::........");
        }
    }
}
