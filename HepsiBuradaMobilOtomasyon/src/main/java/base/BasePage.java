package base;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reports.ExtentTestReports;
import java.util.List;

public class BasePage extends ExtentTestReports {
    AppiumDriver driver;

    WebDriverWait wait;

    public ExtentTest startTest = extent.createTest("Hepsiburada Test","Giris Otomasyon Testi");

    public BasePage(AppiumDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);

    }

    public WebElement find(By Locator) {

        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        return driver.findElement(Locator);
    }

    public void sendKeys(By Locator, String text) {
         find(Locator).sendKeys(text);

    }
    public void click(By Locator){

        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        find(Locator).click();
    }




public void infoLog(String str){
        startTest.log(Status.INFO,str);
}
public void passLog(String str){

      startTest.log(Status.PASS,str);

}

    public void faillLog(String str){

        startTest.log(Status.FAIL,str);

    }

    public List<WebElement> findAll(By Locator){
        return driver.findElements(Locator);

    }
}
