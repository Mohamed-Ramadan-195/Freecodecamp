package tests;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ResponsiveTest extends BaseTest {
    HomePage homePage;

    @Test
    public void setNewSize() throws InterruptedException {
        homePage = new HomePage(driver);
        driver.manage().window().setSize(new Dimension(500, driver.manage().window().getSize().height));
        Thread.sleep(5000);
    }
}
