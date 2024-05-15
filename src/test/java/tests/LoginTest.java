package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void testLogin() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.openSignIn();

        loginPage = new LoginPage(driver);
        loginPage.writeEmail("mohamed19@gmail.com");

        loginPage.continueClick();
        Assert.assertEquals(driver.getTitle(), "Sign in to freeCodeCamp.org");
        Thread.sleep(5000);
    }
}
