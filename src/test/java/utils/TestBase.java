package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src/test/resources/global.properties");
        // FileInputStream class convert .property file to inputStream object // System.getProperty("user.dir")  and   // only before src
        Properties prop = new Properties();
        // Properties class able to read file with .properties extension
        prop.load(fis);
        // .load can only load inputStream object
        String url = prop.getProperty("QAUrl");

        if(driver == null)
        {
            if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
            {
                driver = new ChromeDriver();
            } else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
            {
                driver = new FirefoxDriver();
            } else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
            {
                driver = new EdgeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(url);
        }
        return driver;
    }
}
