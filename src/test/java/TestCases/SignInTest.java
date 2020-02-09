package TestCases;

import listener.Listener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SignInFunction;
import utils.BaseTest;
@Listeners({Listener.class})

public class SignInTest extends BaseTest {
    @Test

    public void signInTestCase()
    {
        SignInFunction signInFunction=new SignInFunction(driver);
        signInFunction.signInForm();
    }

}
