package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegistrationPageStepDefs {
    WebDriver driver;
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("User goes to the home page")
    public void user_goes_to_the_home_page() {
       Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @Given("User goes to the {string}")
    public void userGoesToThe(String url) {
        Driver.getDriver().get(url);
    }
    @When("User clicks on \"User Icon\" in the top right corner")
    public void user_clicks_on_user_icon() {
        registrationPage.userIcon.click();
    }
    @When("User clicks on \"Register\" from drop down menu")
    public void user_clicks_on_register() {
        registrationPage.registerButton.click();
    }
    @When("User enters the password from test data column into \"New Password\" input field")
    public void user_enters_password_into_new_password_field(String password) {
        JSUtils.scrollDownByJS();
        ReusableMethods.waitFor(3);
        registrationPage.newPasswordField.sendKeys(password);
    }

    @When("User enters the {string} into New Password input field")
    public void user_enters_the_into_new_password_input_field(String string) {
        ReusableMethods.waitFor(3);
        registrationPage.newPasswordField.sendKeys(string);
    }
    @When("User clicks on Register submit button")
    public void User_clicks_on_register_submit_button() {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(registrationPage.RegisterSubmitButton);
    }
    @Then("Verify that error message appears")
    public void verify_that_error_message_appears() {
        assertTrue(registrationPage.errorMessagePassAtLeast4Char.isDisplayed());
    }
    @Then("Verify that the error message appears")
    public void verify_that_the_error_message_appears() {
        assertTrue(registrationPage.errorMessagePassRequired.isDisplayed());
    }
    @Then("Verify that password strength is weak-red")
    public void verify_that_password_strength_is_weak_red() {
        String redBar = registrationPage.passwordStrengthBar1.getAttribute("style");
       assertEquals("background-color: rgb(255, 0, 0);",redBar);
    }
    @Then("Verify that password strength is good-orange")
    public void verify_that_password_strength_is_good_orange() {
        String orangeBar = registrationPage.passwordStrengthBar1.getAttribute("style");
        assertEquals("background-color: rgb(255, 153, 0);",orangeBar);
    }
    @Then("Verify that password strength is the strongest-green")
    public void verify_that_password_strength_is_the_strongest_green() {
        String greenBarMax = registrationPage.passwordStrengthBar1.getAttribute("style");
        assertEquals("background-color: rgb(0, 255, 0);",greenBarMax);
    }
    @Then("Verify that password strength is strong-green")
    public void verifyThatPasswordStrengthIsStrongGreen() {
        String greenBar = registrationPage.passwordStrengthBar1.getAttribute("style");
        assertEquals("background-color: rgb(153, 255, 0);",greenBar);
    }
    @And("User closes the application")
    public void userClosesTheApplication() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }
    @After
    public void close_application() throws InterruptedException {
        Driver.closeDriver();
    }


}
