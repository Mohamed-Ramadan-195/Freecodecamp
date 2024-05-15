package tests;

import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;

public class CreateAccountTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    CreateAccountPage createAccountPage;

    @Test
    public void testCreateAccount() {
        homePage = new HomePage(driver);
        homePage.openSignIn();

        loginPage = new LoginPage(driver);
        loginPage.signUpClick();

        createAccountPage = new CreateAccountPage(driver);
        createAccountPage.inputEmail.sendKeys("maryamohameda@gmial.com");

        createAccountPage.continueClick();
        createAccountPage.codeEmail.sendKeys("23659");

        createAccountPage.continueClick();
          if (createAccountPage.notValid.getText().contains("Code is invalid")) {
            createAccountPage.resendClick();
        }
    }
}
