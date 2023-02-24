package stepdefinitions.UITestStepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Registerpage;

public class RegisterpageStepDefs {


    Registerpage registerpage = new Registerpage();

    @Then("click on register option")
    public void click_on_register_option() {
        registerpage.registerOption.click();

    }

    @Then("{string} enters {string} in SSN box")
    public void enters_in_ssn_box(String string, String ssn) {

        registerpage.enterSSN.sendKeys("333-22-4545");

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
