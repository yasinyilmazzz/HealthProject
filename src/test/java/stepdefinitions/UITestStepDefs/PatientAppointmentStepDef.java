package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PatientAppointmentPage;
import utilities.ReusableMethods;

public class PatientAppointmentStepDef {
    PatientAppointmentPage patientAppo=new PatientAppointmentPage();
    public static String today;
    public static String year;
    public static String mount;
    public static String day;

    @Then("User clicks My Pages button")
    public void
    user_clicks_my_pages_button() {
        patientAppo.myPagesButton.click();
        ReusableMethods.waitFor(3);
    }


    @Then("User clicks Make an Appoinnment button")
    public void user_clicks_make_an_appoinnment_button() {
    patientAppo.makeAnAppointmentButton.click();
    ReusableMethods.waitFor(3);
    }

    @Then("Enter a valid phone number to the textbox")

    public void enter_a_valid_phone_number_to_the_textbox() {
      patientAppo.phoneNumber.sendKeys("1234567890");
    }

    @Then("Get today's date to the Appointment DateTime box")
    public void enter_today_s_date_to_the_appointment_date_time_box() {
        today=patientAppo.appointmentDateTextBox.getAttribute("value");
        System.out.println("today = " + today);
        year=today.substring(0,4);
        System.out.println("year = " + year);
        mount=today.substring(5,7);
        System.out.println("mount = " + mount);
        day=today.substring(8);
        System.out.println("day = " + day);

    }

    @Then("Clicks to send an Appoinment button")
    public void clicks_to_send_an_appoinment_button() {
        patientAppo.sendAppoButton.click();
        ReusableMethods.waitFor(2);

    }

    @Then("User verify Appointment Saved Alert")
    public void clicks_my_appoinments_button() {
       Boolean alertDisplayed=patientAppo.apapoSavedAlert.isDisplayed();
        Assert.assertTrue(alertDisplayed);
       }


    @Then("User type to a future date to date textbox")
    public void userTypeToAFutureDateToDateTextbox() {
        patientAppo.appointmentDateTextBox.clear();
        patientAppo.appointmentDateTextBox.sendKeys(day);
        ReusableMethods.waitFor(1);
        patientAppo.appointmentDateTextBox.sendKeys(mount);
        ReusableMethods.waitFor(1);
        patientAppo.appointmentDateTextBox.sendKeys("2024");
        ReusableMethods.waitFor(1);
    }

    @Then("User type to a past date to date textbox")
    public void User_type_to_a_past_date_to_date_textbox() {
        patientAppo.appointmentDateTextBox.clear();
        patientAppo.appointmentDateTextBox.sendKeys(day);
        ReusableMethods.waitFor(1);
        patientAppo.appointmentDateTextBox.sendKeys(mount);
        ReusableMethods.waitFor(1);
        patientAppo.appointmentDateTextBox.sendKeys("2022");
        ReusableMethods.waitFor(1);
    }

    @Then("User verify Appointment Saved Alert is not exist")
    public void userVerifyAppointmentSavedAlertIsNotExist() {
        Boolean alertDisplayed=patientAppo.apapoSavedAlert.isDisplayed();
        Assert.assertFalse(alertDisplayed);
    }
}