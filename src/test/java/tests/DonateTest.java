package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DonatePage;
import pages.EnglishCoursePage;
import pages.HomePage;

public class DonateTest extends BaseTest {
    HomePage homePage;
    EnglishCoursePage englishCoursePage;
    DonatePage donatePage;

    @Test
    public void paypalViewed() {
        homePage = new HomePage(driver);
        homePage.selectEnglishCourse();

        englishCoursePage = new EnglishCoursePage(driver);
        englishCoursePage.donateNowClick();

        donatePage = new DonatePage(driver);
        donatePage.donateClick();

        Assert.assertEquals(donatePage.paypalButton.getText(), "PayPal");
    }
}
