package pageObjects;

import org.openqa.selenium.WebDriver;

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
