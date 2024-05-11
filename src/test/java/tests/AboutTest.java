package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.AboutPage;
import pages.HomePage;

public class AboutTest extends BaseTest {
    HomePage homePage;
    AboutPage aboutPage;

    @Test
    public void testAbout() throws InterruptedException {
        homePage = new HomePage(driver);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("scrollBy(0,4000)");
        homePage.openAbout();

        aboutPage = new AboutPage(driver);
    }
}
