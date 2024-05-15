package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShopPage extends BasePage {
    public ShopPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"site-main\"]/div/article/figure/picture/img")
    public WebElement shopImage;
}
