package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientInfoPage {

    public PatientInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(xpath = "//span[.='Settings']")
    public WebElement settings;

    @FindBy(id = "settings-title")
    public WebElement settingsTitle;

}
