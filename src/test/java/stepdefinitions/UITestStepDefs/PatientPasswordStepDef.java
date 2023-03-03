package stepdefinitions.UITestStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.PasswordPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class PatientPasswordStepDef {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    PasswordPage passwordPage = new PasswordPage();


    @Given("patient goes home page")
    public void patient_goes_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        ReusableMethods.waitFor(3);
    }

    @When("clicks account menu dropdown")
    public void clicks_account_menu_dropdown() {
        homePage.userIcon.click();
        ReusableMethods.waitFor(1);
    }

    @Then("clicks sign in button")
    public void clicks_sign_in_button() {
        homePage.signInOption.click();
        ReusableMethods.waitFor(1);
    }

    @Then("enters {string} in username field")
    public void enters_in_username_field(String string) {
        loginPage.username.sendKeys(string);
        ReusableMethods.waitFor(1);
    }

    @Then("enters {string} in password field")
    public void enters_in_password_field(String string) {
        loginPage.password.sendKeys(string);
        ReusableMethods.waitFor(1);
    }

    @Then("clicks sign in submit button")
    public void clicks_sign_in_submit_button() {
        loginPage.submitButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("clicks user icon")
    public void clicks_user_icon() {
        homePage.userIcon.click();
        ReusableMethods.waitFor(3);
    }

    @Then("clicks password button")
    public void clicks_password_button() {
        passwordPage.passwordButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("enters {string} in current password textbox")
    public void enters_in_current_password_textbox(String string) {
        passwordPage.currentPassword.sendKeys(string);
        ReusableMethods.waitFor(1);
    }

    @Then("enters {string} in new password textbox")
    public void enters_in_new_password_textbox(String string) {
        passwordPage.newPassword.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("enters {string} in the confirm textbox")
    public void enters_in_the_confirm_textbox(String string) {
        passwordPage.confirmPassword.sendKeys(string);
        passwordPage.currentPassword.click();
        ReusableMethods.waitFor(5);
    }

    @Then("verify to {string} message")
    public void verify_to_message(String string) {
        String pageSource = Driver.getDriver().getPageSource();
        System.out.println("pageSource = " + pageSource);
        Assert.assertTrue(pageSource.contains("The password and its confirmation do not match!"));
    }

    @Then("close the driver")
    public void close_the_driver() {
        Driver.closeDriver();
    }

    @Then("verify to {string} message is not exist")
    public void verify_to_message_is_not_exist() {
        String pageSource = Driver.getDriver().getPageSource();
        System.out.println("pageSource = " + pageSource);
        Assert.assertFalse(pageSource.contains("The password and its confirmation do not match!"));
    }

    @Then("verify password strength  is strong")
    public void verify_password_strength_is_strong() {
        String greenBar = passwordPage.strongPasswordBar.getAttribute("style");
        System.out.println("greenBar = " + greenBar);
        Assert.assertEquals("background-color: rgb(0, 255, 0);", greenBar);
    }

    @Then("verify password strength  is not strong")
    public void verify_password_strength_is_not_strong() {
        String greenBar = passwordPage.strongPasswordBar.getAttribute("style");
        System.out.println("greenBar = " + greenBar);
        Assert.assertFalse("background-color: rgb(0, 255, 0);".equals(greenBar));
    }

    @Then("clicks to save button")
    public void clicks_to_save_button() {
        passwordPage.saveButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("clicks to sign out button")
    public void clicks_to_sign_out_button() {
        passwordPage.logOutButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("verify to sign in failed alert is exist")
    public void verify_to_sign_in_failed_alert_is_exist() {
        String failAlert = passwordPage.signInFailedAlert.getText();
        Assert.assertEquals(failAlert, "Failed to sign in!");
    }

}
