package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PasswordPage {
    public PasswordPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "currentPassword")
    public WebElement currentPassword;

    @FindBy(id = "newPassword")
    public WebElement newPassword;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public  WebElement confirmMessage;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement strongPasswordBar;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement saveButton;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logOutButton;
    @FindBy(xpath = "//span[.='Password']")
    public WebElement passwordButton ;

    @FindBy(xpath = "//strong[.='Failed to sign in!']")
    public WebElement signInFailedAlert;

}
