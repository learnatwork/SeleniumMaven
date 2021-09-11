package seleniummaven.github;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class UITest 
{
    @Test
    public void startBrowser()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getTitle().contains("Google"),"Title didn't match");
        System.out.println(driver.getTitle());
        driver.quit();
        
    }
}
