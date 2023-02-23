package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PatientInfoPage;
import utilities.ReusableMethods;

public class PatientInfoStepDefs {

    PatientInfoPage patientInfoPage=new PatientInfoPage();

    @When("patient clicks on user icon")
    public void patient_clicks_on_user_icon() {
        ReusableMethods.waitFor(1);
        patientInfoPage.userIcon.click();

    }

    @When("clicks on {string} option")
    public void clicks_on_option(String string) {
        ReusableMethods.waitFor(1);
        patientInfoPage.settings.click();

    }

    @Then("verify that {string} message is displayed")
    public void verifyThatMessageIsDisplayed(String patientInfo) {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(patientInfoPage.settingsTitle.isDisplayed());
    }
}
