package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();

    @When("Admin goes home page")
    public void admin_goes_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @When("Admin click account menu dropdown")
    public void admin_click_account_menu_dropdown() {
        homePage.userIcon.click();
    }

    @Then("Admin click sign in button")
    public void admin_click_sign_in_button() {
        homePage.signInOption.click();
    }

    @Then("Admin close the app")
    public void admin_close_the_app() {
        Driver.closeDriver();
    }
}
