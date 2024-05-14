package tests;

import org.testng.Assert;
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
        driver.get("https://auth.freecodecamp.org/u/login/identifier?state=hKFo2SBnRkFodGwyMFRiQlBCVHNqMXdjRVNreVQxZXRXUUN4QqFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIHQtbE9OR3hiVk5ad3A0VWlBaUlnOFJxNWFvdjVBYl9ao2NpZNkgYVVEdjlqVnFUZnhCUkUxbDYwTkE1QWY3eVRDR0U0Y3k");

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
