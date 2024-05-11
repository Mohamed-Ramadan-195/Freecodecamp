package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class GuideTest extends BaseTest {
    HomePage homePage;

    @Test
    public void guideSubject() {
        homePage = new HomePage(driver);
        homePage.openGuide();
    }
}
