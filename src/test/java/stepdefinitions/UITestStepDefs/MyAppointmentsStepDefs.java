package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MyAppointmentsPage;
import utilities.Driver;
import utilities.JSUtils;

import java.util.List;

public class MyAppointmentsStepDefs {
    MyAppointmentsPage myAppointmentsPage = new MyAppointmentsPage();

    @When("Doctor clicks {string} appointment edit button")
    public void doctor_clicks_appointment_edit_button(String string) {

        Actions actions =new Actions(Driver.getDriver());
        actions.click(myAppointmentsPage.firstEditButton).perform();

//        switch (string) {
//            case "first":
//                myAppointmentsPage.firstEditButton.click();
//                break;
//            case "second":
//                JSUtils.clickElementByJS(myAppointmentsPage.secondEditButton);
//                break;
//            default:
//                JSUtils.clickElementByJS(myAppointmentsPage.thirdEditButton);
//                break;
//        }


    }

    @Then("Doctor verifies that {string} header is visible")
    public void doctor_verifies_that_header_is_visible(String string) {
        Assert.assertTrue(myAppointmentsPage.createOrEditHeader.isDisplayed());
    }

    @Then("Doctor verifies that {string} is visible")
    public void doctor_verifies_that_is_visible(String string) {

        switch (string) {
            case "ID" -> Assert.assertTrue(myAppointmentsPage.id.isDisplayed());
            case "Start DateTime" -> Assert.assertTrue(myAppointmentsPage.startDate.isDisplayed());
            case "End DateTime" -> Assert.assertTrue(myAppointmentsPage.endDate.isDisplayed());
            case "Status" -> Assert.assertTrue(myAppointmentsPage.status.isDisplayed());
            case "Physician" -> Assert.assertTrue(myAppointmentsPage.physician.isDisplayed());
            default -> System.out.println("invalid credentials");
        }

    }

    @When("Doktor enters {string} in Anamnesis field")
    public void doktor_enters_in_anamnesis_field(String string) {
        myAppointmentsPage.anamnesis.sendKeys(string);
    }

    @When("Doctor enters {string} in Treatment field")
    public void doctor_enters_in_treatment_field(String string) {
        myAppointmentsPage.treatment.sendKeys(string);
    }

    @When("Doctor enters {string} in Diagnosis field")
    public void doctor_enters_in_diagnosis_field(String string) {
        myAppointmentsPage.diagnosis.sendKeys(string);
    }

    @When("Doctor enters {string} in Prescription field")
    public void doctor_enters_in_prescription_field(String string) {
        myAppointmentsPage.prescription.sendKeys(string);
    }

    @When("Doctor enters {string} in Description field")
    public void doctor_enters_in_description_field(String string) {
        myAppointmentsPage.description.sendKeys(string);
    }

    @When("Doctor clicks save button")
    public void doctor_clicks_save_button() {
        JSUtils.clickElementByJS(myAppointmentsPage.saveButton);
    }

    @Then("doctor verifies that to be on the Appointment page")
    public void doctor_verifies_that_to_be_on_the_appointment_page() {
        Assert.assertTrue(myAppointmentsPage.appointmentHeading.isDisplayed());
    }

    @Then("Doctor verifies that {string} message visibility")
    public void doctor_verifies_that_message_visibility(String string) {
        Assert.assertTrue(myAppointmentsPage.requiredFieldMessage.isDisplayed());
    }


}
