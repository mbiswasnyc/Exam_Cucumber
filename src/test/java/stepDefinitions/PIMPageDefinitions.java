package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.PIMPage;
import utils.TestContextSetup;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class PIMPageDefinitions {
    public WebDriver driver;
    TestContextSetup testContextSetup;
    public PIMPage pimPage;
    public Logger log;
    public PIMPageDefinitions(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.pimPage = testContextSetup.pageObjectManager.getPIMPage();
        this.log = LogManager.getLogger(this.getClass().getName()); // added for log
    }

    @Then("user land on PIM page")
    public void user_land_on_PIM_page()
    {
        Assert.assertTrue(pimPage.pimPageTitleIsPresent());
        log.info("user landed on PIM page");
        log.info("Page title is "+pimPage.pimPageTitle());
    }
}
