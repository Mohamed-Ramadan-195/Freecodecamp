package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"universal-nav\"]/div[2]/a/span[2]")
    public WebElement signInButton;

//    @FindBy(className = "login-btn-text")
//    public WebElement getStartedButton;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div[4]/div[1]/ul[2]/li")
    public WebElement EnglishForDevelopersCourse;

    @FindBy(className = "menu-btn-text")
    public WebElement menuList;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/footer/div[2]/div/a[1]")
    public WebElement aboutButton;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/footer/div[1]/div[2]/ul/li[12]/a")
    public WebElement guide;

    public void openSignInAndGetStarted() {
        signInButton.click();
        // getStartedButton.click();
    }

    public void selectEnglishCourse() {
        EnglishForDevelopersCourse.click();
    }

    public void openMenuList() {
        menuList.click();
        WebElement news = menuList.findElement(By.xpath("//*[@id=\"universal-nav\"]/div/ul[2]/li[4]/a"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(news)).click();
    }

    public void openAbout() {
        aboutButton.click();
    }

    public void openGuide() {
        guide.click();
    }
}
