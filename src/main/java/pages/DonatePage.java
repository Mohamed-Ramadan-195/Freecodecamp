package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonatePage extends BasePage {
    public DonatePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[1]/div/main/div/div[2]/div[1]/div/div/button")
    public WebElement donateButton;

    @FindBy(xpath = "//*[@id=\"buttons-container\"]/div/div[1]/div")
    public WebElement paypalButton;

    public void donateClick() {
        donateButton.click();
    }
}
