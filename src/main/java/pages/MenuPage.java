package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Forum")
    public WebElement forumTab;

    @FindBy(linkText = "News")
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

    public void openNews() {
        newsTab.click();
    }

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
