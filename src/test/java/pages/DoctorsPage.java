package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DoctorsPage {
    public DoctorsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "entity-menu")
    public WebElement myPages;

    @FindBy(linkText = "My Appointments")
    public WebElement myAppointments;

    @FindBy(xpath = "//tbody//td[1]")
    public WebElement patientId;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> patientIdList;

    @FindBy(id = "fromDate")
    public WebElement timeSlotFrom;

    @FindBy(id = "toDate")
    public WebElement timeSlotTo;

    @FindBy(xpath = "//tbody//td[2]")
    public WebElement startDateAndTime;

    @FindBy(xpath = "//tbody//td[3]")
    public WebElement endDateAndTime;

    @FindBy(xpath = "//tbody//td[4]")
    public WebElement appointmentStatus;

    @FindBy(xpath = "//tbody//td[4]")
    public List<WebElement> appointmentStatusList;



}
