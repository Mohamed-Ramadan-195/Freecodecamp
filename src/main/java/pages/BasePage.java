package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public Select select;
    public Actions action;
    WebDriverWait wait;
    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
