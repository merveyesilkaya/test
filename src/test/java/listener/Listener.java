package listener;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener{
    public void onTestStart(ITestResult ıTestResult){
        driver.navigate().to("https://www.n11.com/");

    }
    public void onTestSuccess(ITestResult ıTestResult){
       System.out.println("başarılı");
    }
    public void onTestFailure(ITestResult ıTestResult){
        System.out.println("fail");
    }
    public void onTestSkipped(ITestResult ıTestResult){
        System.out.println("skip");

    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult ıTestResult){

    }
    public void onStart(ITestContext ıTestContext){
        driver=new FirefoxDriver();

    }
    public void onFinish(ITestContext ıTestContext){

    }



}
