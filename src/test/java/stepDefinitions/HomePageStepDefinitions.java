package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.HomePage;
import utils.TestContextSetup;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HomePageStepDefinitions
{
    public WebDriver driver;
    public Logger log;
    TestContextSetup testContextSetup;
    HomePage homePage;
    public HomePageStepDefinitions(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.homePage = testContextSetup.pageObjectManager.getHomePage();
        this.log = LogManager.getLogger(this.getClass().getName()); // added for log
    }


    @Given("user is on OrangeHRM homepage")
    public void user_is_on_orange_hrm_homepage() {
        //log = LogManager.getLogger(this.getClass().getName()); // added for log
        Assert.assertTrue(homePage.urlIsOrangeHRMHomePage());
        log.info("user landed on home page");

    }

    @When("^user enter valid (.+) and (.+)$")
    public void user_enter_valid_user_name_and_password(String userName, String passWord) {
        homePage.enterValidCredential(userName,passWord);
        homePage.clickLogInBtn();
        log.info("user enter valid credentials");
    }
    @When("^user enter invalid (.+) and (.+)$")
    public void user_enter_invalid_user_name_and_password(String userName, String passWord) {
        homePage.enterValidCredential(userName,passWord);
        homePage.clickLogInBtn();
        log.info("user enter invalid credentials");
    }
    @Then("user cannot login to dashboard page")
    public void user_cannot_login_to_dashboard_page()
    {
       Assert.assertTrue(homePage.urlIsOrangeHRMHomePage());
    }
    @And("Invalid credentials massage will appear")
    public void Invalid_credentials_massage_will_appear()
    {
        Assert.assertEquals(homePage.getErrorMassage(), "Invalid credentials");
        log.info("user see error massage");
    }

}
