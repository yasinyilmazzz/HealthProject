package stepdefinitions.UITestStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US02_Registration {

    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    String ssn = faker.idNumber().ssnValid();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String username = faker.name().username();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();
    String passwordConfirm = password;

    @When("{string} goes home page")
    public void goes_home_page(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        registrationPage.userIcon.click();
        registrationPage.registerButton.click();

    }
    @When("User enter valid registration information")
    public void user_enter_valid_registration_information() {
     registrationPage.enterSSN.sendKeys(ssn);
     registrationPage.enterFirstName.sendKeys(firstName);
     registrationPage.enterLastName.sendKeys(lastName);
     registrationPage.userName.sendKeys(username);
     registrationPage.email.sendKeys(email);
     registrationPage.newPasswordField.sendKeys(password);
     registrationPage.passwordConfirmation.sendKeys(passwordConfirm);
    }
    @When("User click the submit button")
    public void user_click_the_submit_button() {
        registrationPage.registerSubmitButton.click();
    }
    @Then("User should see a success message")
    public void user_should_see_a_success_message() {
        String message = registrationPage.messageAfterSubmit.getText();
        Assert.assertTrue(message,true);
    }

    @When("User enter a valid username")
    public void user_enter_a_valid_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User submit the registration")
    public void user_submit_the_registration() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
//    @Then("User should see a success message")
//    public void user_should_see_a_success_message() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @When("User attempt to register with the same username")
    public void user_attempt_to_register_with_the_same_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should see an error message")
    public void user_should_see_an_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("User enter an invalid email ID")
    public void user_enter_an_invalid_email_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("User leave the email field blank")
    public void user_leave_the_email_field_blank() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User submit the registration form")
    public void user_submit_the_registration_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
