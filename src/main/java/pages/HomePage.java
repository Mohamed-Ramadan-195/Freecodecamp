package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"universal-nav\"]/div[2]/a/span[2]")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div[4]/div[1]/ul[2]/li")
    public WebElement EnglishForDevelopersCourse;

    @FindBy(xpath = "//*[@id=\"toggle-button-nav\"]/span[2]")
    public WebElement menuList;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/footer/div[2]/div/a[4]")
    public WebElement shopPage;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/footer/div[1]/div[2]/ul/li[12]/a")
    public WebElement guide;

    @FindBy(xpath = "//*[@id=\"ais-SearchBox-input\"]")
    public WebElement  search;

    @FindBy(id = "toggle-lang-button")
    public WebElement languageButton;

    @FindBy(xpath = "//*[@id=\"nav-lang-list\"]/li[2]")
    public WebElement espaniolLanguage;

    public void openSignIn() {
        signInButton.click();
    }

    public void selectEnglishCourse() {
        EnglishForDevelopersCourse.click();
    }

    public void openShopPage() {
        shopPage.click();
    }

    public void openGuide() {
        guide.click();
    }

    public void clickSearch() {
        search.click();
    }

    public void enterSearchText(String searchText) {
        search.clear();
        search.sendKeys(searchText);
        search.sendKeys(Keys.RETURN);
    }

    public void setMenuList() {
        menuList.click();
    }

    public void clickLanguage() {
        languageButton.click();
    }

    public void setLanguage() {
        espaniolLanguage.click();
    }
}
