package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTest {
    public static WebDriver driver;

    @Test
    public void doBaseTest(){
       WebDriver driver;
        System.setProperty("webdriver.gecko.driver","\\properties\\driver\\geckodriver.exe");
        driver=new FirefoxDriver();



        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("https://www.n11.com/");
    }

}
