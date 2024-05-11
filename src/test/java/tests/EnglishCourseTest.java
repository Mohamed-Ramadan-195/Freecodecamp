package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EnglishCoursePage;
import pages.HomePage;

public class EnglishCourseTest extends BaseTest {
    HomePage homePage;
    EnglishCoursePage englishCoursePage;

    @Test(priority = 1)
    public void testPage() {
        homePage = new HomePage(driver);
        // Assert.assertEquals(driver.getTitle(),"Learn to Code — For Free — Coding Courses for Busy People");
        executor = (JavascriptExecutor) driver;
        executor.executeScript("scrollBy(0,4000)");
        homePage.selectEnglishCourse();
        englishCoursePage = new EnglishCoursePage(driver);
        // Assert.assertEquals(driver.getTitle(), "A2 English for Developers (Beta)");
    }

    @Test(priority = 2)
    public void testDonate() {
        homePage = new HomePage(driver);
        executor.executeScript("scrollBy(0,4000)");
        englishCoursePage.donateNowClick();
    }
}
