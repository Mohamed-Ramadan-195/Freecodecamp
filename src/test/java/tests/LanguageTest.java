package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LanguageTest extends BaseTest {
    HomePage homePage;

    @Test
    public void testChangeLanguage() {
        homePage = new HomePage(driver);
        homePage.clickLanguage();
        homePage.setLanguage();
        Assert.assertTrue(homePage.menuList.getText().equals("Menú"));
    }
}
