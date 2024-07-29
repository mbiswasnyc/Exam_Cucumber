package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
    public WebDriver driver;
    public PIMPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By pimPageTitle = By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6");
    By addEmployeeBtn = By.cssSelector("header[class='oxd-topbar']>div:nth-child(2)>nav>ul>li:nth-child(3)");

    public Boolean pimPageTitleIsPresent()
    {
        return driver.findElement(pimPageTitle).getText().equalsIgnoreCase("PIM");
    }
    public String pimPageTitle()
    {
        return driver.findElement(pimPageTitle).getText();
    }
    public void clickAddEmployeeBtn()
    {
        driver.findElement(addEmployeeBtn).click();
    }
}
