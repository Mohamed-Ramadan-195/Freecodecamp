package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement emailTextField;

    @FindBy(name = "action")
    public WebElement continueWithEmailButton;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div/main/section/div/div/div/div[2]/p/a")
    public WebElement signUpButton;

    public void writeEmail(String email) {
        emailTextField.sendKeys(email);
    }

    public void continueClick() {
        continueWithEmailButton.click();
    }

    public void signUpClick() {
        signUpButton.click();
    }
}
