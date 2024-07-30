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
    @When("^user enter valid (.+) and (.+)$")
    public void user_enter_valid_user_name_and_password(String userName, String passWord) {
        homePage.enterValidCredential(userName,passWord);
        homePage.clickLogInBtn();
    }
    @When("^user enter invalid (.+) and (.+)$")
    public void user_enter_invalid_user_name_and_password(String userName, String passWord) {
        homePage.enterValidCredential(userName,passWord);
        homePage.clickLogInBtn();
        Assert.assertEquals(homePage.getErrorMassage(), "Invalid credentials");
    }
    @Then("Invalid credentials massage will appear")
    public void Invalid_credentials_massage_will_appear()
    {
        Assert.assertEquals(homePage.getErrorMassage(), "Invalid credentials");
    }

}
