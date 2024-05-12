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

public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    HomePage homePage;

    @FindBy(className = "menu-btn-text")
    public WebElement menuList;

    @FindBy(linkText = "Forum")
    public WebElement forumTab;

    @FindBy(xpath = "//*[@id=\\\"universal-nav\\\"]/div/ul[2]/li[4]/a")
    public WebElement newsTab;

    @FindBy(linkText = "Radio")
    public WebElement radioTab;

    @FindBy(linkText = "Contribute")
    public WebElement contributeTab;

    @FindBy(linkText = "Podcast")
    public WebElement podcastTab;

    public void openForum() {
        forumTab.click();
    }

//    public void openNews() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOf(newsTab)).click();
//    }

    public void openRadio() {
        radioTab.click();
    }

    public void openContribute() {
        contributeTab.click();
    }

    public void openPodcast() {
        podcastTab.click();
    }
}
