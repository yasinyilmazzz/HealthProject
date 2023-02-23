package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAppointmentsPage {
    public MyAppointmentsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "appointment-heading")
    public WebElement appointmentHeading;

    @FindBy(xpath = "//span[@class='d-none d-md-inline'][1]")
    public WebElement firstEditButton;

    @FindBy(xpath = "//span[@class='d-none d-md-inline'][1]")
    public WebElement secondEditButton;

    @FindBy(xpath = "//span[@class='d-none d-md-inline'][1]")
    public WebElement thirdEditButton;
}
