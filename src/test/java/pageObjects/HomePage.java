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
    By errorMassage = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
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
    public String getErrorMassage()
    {
        return driver.findElement(errorMassage).getText();
    }
}
