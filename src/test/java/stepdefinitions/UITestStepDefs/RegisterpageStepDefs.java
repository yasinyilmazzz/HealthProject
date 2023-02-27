package stepdefinitions.UITestStepDefs;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import pages.Registerpage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class RegisterpageStepDefs {


    Registerpage registerpage = new Registerpage();

    @Then("click on register option")
    public void click_on_register_option() {
        registerpage.registerOption.click();
    }

    @Then("{string} enters {string} in SSN box")
    public void enters_in_ssn_box(String string, String ssn) {
        Faker faker = new Faker();

        registerpage.enterSSN.sendKeys(ConfigReader.getProperty(ssn));
        System.out.println(faker.idNumber().ssnValid());
        ReusableMethods.waitFor(1);
        Assert.assertFalse(ssn.contains("Your SSN is invalid"));//positive test
        assertTrue(ssn.contains("valid_ssn_number"));

    }

    @And("{string} enters {string} in First Name Box")
    public void entersInFirstNameBox(String String, String firstName) {
        registerpage.enterFirstName.sendKeys(firstName);
    }
    @Then("{string} leaves the first name box blank")
    public void leaves_the_first_name_box_blank(String string) {
        registerpage.enterFirstName.click();
    }
    @Then("{string} enters chars in last name box")
    public void enters_chars_in_last_name_box(String string) {
        registerpage.enterLastName.click();
    }
    @Then("verify FirstName is required")
    public void verify_first_name_is_required() {
        assertTrue(registerpage.firstNameRequired.isDisplayed());
    }

    @And("{string} enters {string} in Last Name Box")
    public void entersInLastNameBox(String String, String lastname) {
        registerpage.enterLastName.sendKeys(lastname);

    }
    @Then("{string} leaves the last name box blank")
    public void leaves_the_last_name_box_blank(String string) {

        registerpage.enterLastName.sendKeys(" ");
    }

    @Then("{string} enters letters in username box")
    public void enters_letters_in_username_box(String string) {
        registerpage.userName.click();
    }
    @Then("verify that LastName is required")
    public void verifyThatLastNameIsRequired() {
        assertTrue(registerpage.lastNameRequired.isDisplayed());
    }
    @After
    public void close_application() throws InterruptedException {
        Driver.closeDriver();
    }
}