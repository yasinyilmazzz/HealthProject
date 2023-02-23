package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();

    @When("{string} goes home page")
    public void goes_home_page(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @When("{string} clicks account menu dropdown")
    public void clicks_account_menu_dropdown(String string) {
        homePage.userIcon.click();
    }
    @When("{string} clicks sign in button")
    public void clicks_sign_in_button(String string) {
        homePage.signInOption.click();
    }

    @Then("Admin close the app")
    public void admin_close_the_app() {
        Driver.closeDriver();
    }
}
