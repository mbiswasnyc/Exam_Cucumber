package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.DashboardPage;
import pageObjects.HomePage;
import utils.TestContextSetup;

public class DashboardPageStepDefinitions
{
    public WebDriver driver;
    TestContextSetup testContextSetup;
    DashboardPage dashboardPage;
    public DashboardPageStepDefinitions(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.dashboardPage = testContextSetup.pageObjectManager.getDashboardPage();
    }

    @Then("user can login to dashboard page")
    public void user_can_login_to_dashboard_page() {
        Assert.assertTrue(dashboardPage.dashboardTitlePresent());
    }
    @Then("user can use my info button")
    public void user_can_use_my_info_button()
    {
        dashboardPage.clickMyInfoBtn();
    }


    @When("user select PIM option")
    public void user_select_PIM_option()
    {
        dashboardPage.clickPIMBtn();
    }


}
