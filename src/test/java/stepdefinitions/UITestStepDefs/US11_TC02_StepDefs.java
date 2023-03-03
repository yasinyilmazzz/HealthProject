package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.DoctorsPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US11_TC02_StepDefs {

    DoctorsPage doctorsPage= new DoctorsPage();
    @Then("assert that doctor can see patient id")
    public void assert_that_doctor_can_see_patient_id() {
        assertTrue(doctorsPage.patientId.isDisplayed());

        ReusableMethods.waitFor(5);
        for (WebElement w : doctorsPage.patientIdList) {
            System.out.println(w.getText());
        }
    }
    @Then("assert that doctor can see start date")
    public void assert_that_doctor_can_see_start_date() {
        assertTrue(doctorsPage.startDateAndTime.isDisplayed());
    }
    @Then("assert that doctor can see end date")
    public void assert_that_doctor_can_see_end_date() {
        assertTrue(doctorsPage.endDateAndTime.isDisplayed());
    }
    @Then("assert that doctor can see status")
    public void assert_that_doctor_can_see_status() {
        assertTrue(doctorsPage.appointmentStatus.isDisplayed());

        ReusableMethods.waitFor(5);
        for (WebElement w : doctorsPage.appointmentStatusList) {
            System.out.println(w.getText());
        }
    }

//    @And("close the application")
//    public void closeTheApplication() {
//        Driver.closeDriver();
//    }
}