package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenuPage;

public class MenuTest extends BaseTest {
    HomePage homePage;
    MenuPage menuPage;

    @Test
    public void testMenuList() {
        homePage = new HomePage(driver);
        homePage.openMenuList();

        menuPage = new MenuPage(driver);
        // menuPage.openForum();
    }
}
