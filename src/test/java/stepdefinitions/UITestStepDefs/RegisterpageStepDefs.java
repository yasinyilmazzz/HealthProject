package stepdefinitions.UITestStepDefs;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Registerpage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

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
        Assert.assertTrue(ssn.contains("valid_ssn_number"));
    }

    @And("{string} enters {string} in First Name Box")
    public void entersInFirstNameBox(String String, String firstName) {
        registerpage.enterFirstName.sendKeys(firstName);


    }

    @Then("{string} enters {string} in Last Name Box")
    public void enters_in_last_name_box(String string, String lastName) {

        registerpage.enterLastName.sendKeys(lastName);


    }


}
