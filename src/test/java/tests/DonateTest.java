package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DonatePage;
import pages.HomePage;

public class DonateTest extends BaseTest {
    HomePage homePage;

    DonatePage donatePage;

    @Test(priority = 1)
    public void testDonatePage() {
        homePage = new HomePage(driver);
        homePage.setMenuList();
        driver.navigate().to("https://www.freecodecamp.org/donate");
    }

    @Test(priority = 2)
    public void testDonateCost() {
        donatePage = new DonatePage(driver);
        if (donatePage.cost5.getAttribute("aria-selected").equals("true")) {
            Assert.assertEquals(donatePage.costSentence.getText(), "Confirm your donation of $5 / month:");
        } else {
            donatePage.setCost5();
            Assert.assertEquals(donatePage.costSentence.getText(), "Confirm your donation of $5 / month:");
        }
    }

    @Test(priority = 3)
    public void testDonateConfirm() {
        donatePage.donateClick();
        Assert.assertTrue(donatePage.patreonButton.isDisplayed());
    }

}
