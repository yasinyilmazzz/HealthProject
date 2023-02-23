package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.Then;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();

    @Then("Admin enters admin_username")
    public void admin_enters_admin_username() {
        loginPage.username.sendKeys(ConfigReader.getProperty("admin_username"));
    }
    @Then("Admin enters admin_password")
    public void admin_enters_admin_password() {
        loginPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
    }
    @Then("Admin clicks sign in submit button")
    public void admin_clicks_sign_in_submit_button() {
        loginPage.submitButton.click();
    }
}
