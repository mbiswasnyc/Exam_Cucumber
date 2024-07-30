package pageObjects;

import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class PageObjectManager {
    public WebDriver driver;
    public HomePage homePage;
    public DashboardPage dashboardPage;
    public PIMPage pimPage;
    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public HomePage getHomePage()
    {
        homePage = new HomePage(driver);
        return homePage;
    }
    public DashboardPage getDashboardPage()
    {
        dashboardPage = new DashboardPage(driver);
        return dashboardPage;
    }
    public PIMPage getPIMPage()
    {
        pimPage = new PIMPage(driver);
        return pimPage;
    }
}
