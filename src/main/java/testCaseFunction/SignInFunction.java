package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.jvm.hotspot.utilities.Assert;
import utils.BasePage;

public class SignInFunction extends BasePage {
    public SignInFunction(WebDriver driver) {
        super(driver);
    }
    private By firstName=By.id("firstName");
    private By lastName=By.id("lastName");
    private By email=By.id("registrationEmail");
    private By password=By.id("registrationPassword");
    private By getPasswordAgain=By.id("passwordAgain");
    private By phone=By.id("phoneNumber");
    private String pass="1234656";
    private By male=By.id("genderFemale");
    private By birthDay=By.id("birthDay");
    private By birthMonth=By.id("birthMonth");
    private By birthYear=By.id("birthYear");
    private By acceptContract=By.id("acceptContract");
    private By submitBtn=By.id("submitButton");
    public void signInForm(){
        element(By.linkText("Üye Ol")).click();
        sendKeys(firstName,"merve");
        sendKeys(lastName,"Yesilkaya");
        sendKeys(email,"merveyesilkaya@gmail.com");
        sendKeys(password,pass);
        sendKeys(getPasswordAgain,pass);
        sendKeys(phone,"325458565");
        element(male).click();
        SelectElement(element(birthDay),"25");
        SelectElement(element(birthMonth),"02");
        SelectElement(element(birthYear),"1995");
        element(acceptContract).click();
        element(submitBtn).click();

    }
}
