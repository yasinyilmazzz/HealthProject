package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import pages.DoctorsPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US11_TC01_StepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    DoctorsPage doctorsPage = new DoctorsPage();

    @Given("user is on {string} page")
    public void user_is_on_page(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }
    @When("click on user icon")
    public void click_on_user_icon() {
        homePage.userIcon.click();

    }
    @When("click on Sign In option")
    public void click_on_sign_in_option() {
        homePage.signInOption.click();
    }
    @When("enter {string} in Username input")
    public void enter_in_username_input(String userName) {
        ReusableMethods.waitFor(2);
        loginPage.username.sendKeys(userName);

    }
    @When("enter {string} in Password input")
    public void enter_in_password_input(String password) {
        ReusableMethods.waitFor(2);
        loginPage.password.sendKeys(password);
    }
    @When("click on Remember Me checkbox")
    public void click_on_remember_me_checkbox() {
        ReusableMethods.waitFor(2);
        loginPage.rememberMe.click();
    }
    @Then("click on Sign In submit button")
    public void click_on_sign_in_submit_button() {
        loginPage.submitButton.click();
    }
    @Then("click on My Pages")
    public void click_on_my_pages() {
        ReusableMethods.waitFor(2);
        doctorsPage.myPages.click();
    }
    @Then("click on My Appointments")
    public void click_on_my_appointments() {
        ReusableMethods.waitFor(2);
        doctorsPage.myAppointments.click();
    }
    @Then("assert that appointment list is visible")
    public void assert_that_appointment_list_is_visible() {
        // String patientIdList = doctorsPage.patientIdList.getText();
        assertTrue(doctorsPage.patientId.isDisplayed());

        ReusableMethods.waitFor(5);
        for (WebElement w : doctorsPage.patientIdList) {
            System.out.println(w.getText());
        }

    }
    @Then("assert that time slot is visible")
    public void assert_that_time_slot_is_visible() {
        assertTrue(doctorsPage.timeSlotFrom.isDisplayed());
        assertTrue(doctorsPage.timeSlotTo.isDisplayed());
    }


}
