package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePageAppointment {

    public HomePageAppointment() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="firstName")
    public WebElement firstname;

    @FindBy(id ="lastName" )
    public WebElement lastname;

    @FindBy(id = "ssn")
    public WebElement ssn;


}
