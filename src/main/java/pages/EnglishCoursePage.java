package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnglishCoursePage extends BasePage {
    public EnglishCoursePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"task-27\"]/a")
    public WebElement videoNumber;

    @FindBy(xpath = "//*[@id=\"content-start\"]")
    public WebElement courseName;

    @FindBy(xpath = "//*[@id=\"learn-app-wrapper\"]/div/div/div[4]/div/div[2]/button[1]/img")
    public WebElement playVideo;

    @FindBy(xpath = "//*[@id=\"learn-app-wrapper\"]/div/div/div[6]/div[3]/div/p/input[1]")
    public WebElement input1;

    @FindBy(xpath = "//*[@id=\"learn-app-wrapper\"]/div/div/div[6]/div[3]/div/p/input[2]")
    public WebElement input2;

    @FindBy(xpath = "//*[@id=\"__fcc-html\"]/body")
    public WebElement checkAnswerButton;

    public void openVideo() {
        videoNumber.click();
    }

    public void setPlayVideo() {
        playVideo.click();
    }

    public void setCheckAnswerButton() {
        checkAnswerButton.click();
    }
}
