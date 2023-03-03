package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientAppointmentPage {

    public PatientAppointmentPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "MY PAGES(PATIENT)")
    public WebElement myPagesButton;

    @FindBy(linkText = "Make an Appointment")
    public WebElement makeAnAppointmentButton;

    @FindBy(id="phone")
    public WebElement phoneNumber;

    @FindBy(id = "appoDate")
    public WebElement appointmentDateTextBox;

    @FindBy(id="register-submit")
    public WebElement sendAppoButton;

    @FindBy(linkText = "My Appointments")
    public WebElement myAppointmentsButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement apapoSavedAlert;



}
