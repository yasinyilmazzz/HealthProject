package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaLoginPage {

    public MedunnaLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = " //*[@id=\"account-menu\"]/a/svg/path]")
    public WebElement loginIcon;

    @FindBy (xpath = "//span[text()='Sign in']")
    public WebElement singInButton;

    @FindBy(xpath = "//input[@placeholder='Your username']")
    public WebElement username;

    @FindBy (xpath = "//input[@placeholder='Your password']")
    public WebElement password;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement successLogin;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//*[contains(text(),'Failed to sign in! Please check your credentials and try again')]")
    public WebElement failedMessage;

    @FindBy (xpath = "//input[@id='rememberMe']")
    public WebElement rememberMe;

    @FindBy(xpath = "//input[@value='true']")
    public WebElement rememberCheckBox;

    @FindBy(xpath = "//a[@href='/account/reset/request']")
    public WebElement forgetPassword;

    @FindBy(xpath = "//*[contains(text(),'Enter the email address you used to register')]")
    public WebElement registerEmail;

    @FindBy (xpath = "(//div/a[@href='/account/register'])[2]")
    public WebElement newAccount;

    @FindBy (xpath = "(//div/button[@type='button'])[2]")
    public WebElement cancel;

    @FindBy (xpath = "//span[text()='Sign out']")
    public WebElement singOut;
}
