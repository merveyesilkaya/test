package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class AddFunction extends BasePage {
    public AddFunction(WebDriver driver) {
        super(driver);
     driver.findElement(By.id("p-378069846")).click();
     driver.findElement(By.className("btn btnGrey btnAddBasket")).click();
    }
}
