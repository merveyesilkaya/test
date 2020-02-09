package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchFunction extends BasePage {
    public SearchFunction(WebDriver driver) {
        super(driver);
        driver.findElement(By.cssSelector("input(id='searchData')")).sendKeys("bilgisayar");
        driver.findElement(By.className("searchBtn")).click();
        driver.findElement(By.xpath(".//*[@id='pagination']/a[2]")).click();
    }

}
