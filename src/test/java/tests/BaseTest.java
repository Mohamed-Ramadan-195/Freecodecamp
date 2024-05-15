package tests;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wait;
    JavascriptExecutor executor;

    @BeforeClass
    public void openUrl() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.freecodecamp.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void closeUrl() throws InterruptedException {
        driver.quit();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void takeScreenShot(ITestResult iTestResult) throws IOException {
        if(ITestResult.FAILURE == iTestResult.getStatus()) {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot...");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File photo = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(photo, new File("./screenshots/" + iTestResult.getName() + ".png"));
        }
    }
}
