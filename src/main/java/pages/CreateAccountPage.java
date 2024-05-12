package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class CreateAccountPage extends BasePage{
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "email")
    public WebElement inputEmail;
    @FindBy(name = "action")
    public WebElement continueClick;
    @FindBy(id = "code")
    public WebElement codeEmail;
    @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div/div/div/form/button")
    public WebElement resendClick;
    @FindBy(xpath = "//*[@id=\"error-element-code\"]\n")
    public WebElement notValid;

    public void continueClick() {
        continueClick.click();
    }
    public void resendClick() {
        resendClick.click();
    }

//    public static String generateRandomEmail() {
//        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
//        StringBuilder builder = new StringBuilder();
//        Random rnd = new Random();
//        while (builder.length() < 10) { // Length of the email address
//            int index = (int) (rnd.nextFloat() * chars.length());
//            builder.append(chars.charAt(index));
//        }
//        builder.append("@example.com"); // You can replace "example.com" with your actual domain
//        return builder.toString();
//    }

}
