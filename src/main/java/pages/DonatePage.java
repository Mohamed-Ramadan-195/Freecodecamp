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

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[1]/div/main/div/div[2]/div[2]/div/div/div[1]/div/fieldset/a")
    public WebElement patreonButton;

    @FindBy(xpath = "//*[@id=\"radix-4-trigger-2000\"]")
    public WebElement cost20;

    @FindBy(xpath = "//*[@id=\"radix-4-trigger-500\"]")
    public WebElement cost5;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[1]/div/main/div/div[2]/div[1]/div/div/b")
    public WebElement costSentence;

    public void donateClick() {
        donateButton.click();
    }

    public void setCost20() {
        cost20.click();
    }

    public void setCost5() {
        cost5.click();
    }
}
