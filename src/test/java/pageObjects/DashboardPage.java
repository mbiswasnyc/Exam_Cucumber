package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage
{
    public WebDriver driver;
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By dashBoardTitle = By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6");
    By myInfoBtn = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span");
    By pimBtn = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");

    public Boolean dashboardTitlePresent()
    {
        return driver.findElement(dashBoardTitle).getText().equalsIgnoreCase("dashboard");
    }
    public void clickMyInfoBtn()
    {
        driver.findElement(myInfoBtn).click();
    }
    public void clickPIMBtn()
    {
        driver.findElement(pimBtn).click();
    }
}
