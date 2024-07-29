package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    public WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    By userNameField = By.cssSelector("input[name='username']");
    By passWordField = By.cssSelector("input[name='password']");
    By logInBtn = By.cssSelector("button[type='submit']");
    String homePageUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public void enterValidCredential(String userName, String passWord)
    {
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passWordField).sendKeys(passWord);
    }
    public void clickLogInBtn()
    {
        driver.findElement(logInBtn).click();
    }
    public Boolean urlContainOrangeHRM()
    {
        return driver.getCurrentUrl().equalsIgnoreCase(homePageUrl);
    }
}
