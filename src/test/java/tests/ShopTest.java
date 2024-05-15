package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.ShopPage;
import pages.HomePage;

public class ShopTest extends BaseTest {
    HomePage homePage;
    ShopPage shopPage;

    @Test(priority = 1)
    public void testShopPage() throws InterruptedException {
        homePage = new HomePage(driver);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("scrollBy(0,4000)");
        homePage.openShopPage();
    }

    @Test(priority = 2)
    public void testImageShop() {
        shopPage = new ShopPage(driver);
    }
}
