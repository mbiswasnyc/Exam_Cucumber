package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.HomePage;
import utils.TestContextSetup;

public class HomePageStepDefinitions
{
    public WebDriver driver;
    TestContextSetup testContextSetup;
    HomePage homePage;
    public HomePageStepDefinitions(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.homePage = testContextSetup.pageObjectManager.getHomePage();
    }


    @Given("user is on OrangeHRM homepage")
    public void user_is_on_orange_hrm_homepage() {
        Assert.assertTrue(homePage.urlContainOrangeHRM());
    }
    @When("^user enter (.+) and (.+)$")
    public void user_enter_valid_admin_and_admin123(String userName, String passWord) {
        homePage.enterValidCredential(userName,passWord);
        homePage.clickLogInBtn();
    }


}
