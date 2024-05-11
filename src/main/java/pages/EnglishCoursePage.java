package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnglishCoursePage extends BasePage {
    public EnglishCoursePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content-start\"]")
    public WebElement courseTitle;

    @FindBy(className = "btn")
    public WebElement donateNowButton;

    public void donateNowClick() {
        donateNowButton.click();
    }
}
