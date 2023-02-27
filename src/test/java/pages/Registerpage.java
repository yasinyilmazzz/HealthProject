package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Registerpage {

        public Registerpage() {
            PageFactory.initElements(Driver.getDriver(),this);
        }

    @FindBy(xpath ="//span[text()='Register']")
    public WebElement registerOption;

    @FindBy(id = "ssn")
    public WebElement enterSSN;

    @FindBy(id = "firstName")
    public WebElement enterFirstName;

    @FindBy(id = "lastName")
    public WebElement enterLastName;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement firstNameRequired;


}
