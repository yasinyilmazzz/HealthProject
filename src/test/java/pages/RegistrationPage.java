package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="ssn")
    public WebElement ssnTextInput;

    @FindBy(id = "firstName")
    public WebElement firstNameTextInput;

    @FindBy(id = "lastName")
    public WebElement lastNameTextInput;

    @FindBy(id = "username")
    public WebElement userNameTextInput;

    @FindBy(id = "email")
    public WebElement emailTextInput;

    @FindBy(id="secondPassword")
    public WebElement secondPasswordTextInput;

    @FindBy(id="register-submit")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//*[contains(text(),'Registration Saved')]")
    public WebElement successMessageToastContainer;



    //*****************

    @FindBy(id = "account-menu")
    public WebElement userIcon;
    @FindBy(linkText = "Register")
    public WebElement registerButton;
    @FindBy(id = "firstPassword")
    public WebElement newPasswordField;
    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrengthBar1;
    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement passwordStrengthBar2;
    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement passwordStrengthBar3;
    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement passwordStrengthBar4;
    @FindBy(xpath = "(//span[.='Register'])[2]")
    public WebElement RegisterSubmitButton;
    @FindBy(xpath = "//div[.='Your password is required.']")
    public WebElement errorMessagePassRequired;
    @FindBy(xpath = "//div[.='Your password is required to be at least 4 characters.']")
    public WebElement errorMessagePassAtLeast4Char;


}
