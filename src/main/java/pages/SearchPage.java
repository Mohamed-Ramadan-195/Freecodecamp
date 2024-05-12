package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"site-main\"]/div/div[1]")
    public WebElement searchResult;
}


