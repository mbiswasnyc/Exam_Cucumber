package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.PIMPage;
import utils.TestContextSetup;

public class PIMPageDefinitions {
    public WebDriver driver;
    TestContextSetup testContextSetup;
    public PIMPage pimPage;
    public PIMPageDefinitions(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.pimPage = testContextSetup.pageObjectManager.getPIMPage();
    }

    @Then("user land on PIM page")
    public void user_land_on_PIM_page()
    {
        Assert.assertTrue(pimPage.pimPageTitleIsPresent());
        System.out.println("Page title is "+pimPage.pimPageTitle());
    }
}
