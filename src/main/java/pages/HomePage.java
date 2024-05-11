package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    }

    public void openAbout() {
        aboutButton.click();
    }

    public void openGuide() {
        guide.click();
    }
}
