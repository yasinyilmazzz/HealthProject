package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05_MyStepdefs {


    MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

    @Given("user goes to specified URL")
    public void userGoesToSpecifiedURL() {
        // System.out.println(ConfigReader.getProperty("medunnaUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("user clicks on Login button")
    public void userClicksOnLoginButton() {
        medunnaLoginPage.loginIcon.click();
        ReusableMethods.waitFor(5);
    }

    @And("user clicks on Sign in button on the website")
    public void userClicksOnSignInButtonOnTheWebsite() {
        medunnaLoginPage.singInButton.click();
        ReusableMethods.waitFor(5);
    }

    @Given("user enters a valid username in the Username section of the page")
    public void userEntersAValidUsernameInTheUsernameSectionOfThePage() {
        medunnaLoginPage.username.sendKeys(ConfigReader.getProperty("medunnaValidUsername"));
    }

    @And("user enters a valid password in the Password section of the page")
    public void userEntersAValidPasswordInThePasswordSectionOfThePage() {
        medunnaLoginPage.password.sendKeys(ConfigReader.getProperty("medunnaValidPassword"));

    }

    @And("user confirms that entered the sign in page")
    public void userConfirmsThatEnteredTheSignInPage() {
        medunnaLoginPage.signInSubmitButton.click();
    }

    @Given("user clicks {string} button where they can always use their existing credentials")
    public void user_clicks_button_where_they_can_always_use_their_existing_credentials(String string) {

        ReusableMethods.waitFor(1);
        Assert.assertTrue(medunnaLoginPage.rememberMe.isDisplayed());
        medunnaLoginPage.rememberCheckBox.click();
    }

    @Given("user confirms that clicked on {string}")
    public void user_confirms_that_clicked_on(String string) {

        Assert.assertTrue(medunnaLoginPage.rememberCheckBox.isDisplayed());
    }

    @Given("if user forgets the password clicks on the option {string}")
    public void if_user_forgets_the_password_clicks_on_the_option(String string) {

        ReusableMethods.waitFor(1);
        Assert.assertTrue(medunnaLoginPage.forgetPassword.isDisplayed());
        medunnaLoginPage.forgetPassword.click();
    }

    @Given("user confirms that {string} on the page")
    public void user_confirms_that_on_the_page(String string) {

        ReusableMethods.waitFor(1);
        medunnaLoginPage.registerEmail.sendKeys(ConfigReader.getProperty("registerEmail"));
    }
    @Given("user clicks {string} option on the page")
    public void user_clicks_option_on_the_page(String string) {

        ReusableMethods.waitFor(1);
        Assert.assertTrue(medunnaLoginPage.newAccount.isDisplayed());
        medunnaLoginPage.newAccount.click();
    }

    @Given("user confirms that directed to the {string} page on the opened page")
    public void user_confirms_that_directed_to_the_page_on_the_opened_page(String string) {

        ReusableMethods.waitFor(1);
        medunnaLoginPage.newAccount.click();
        Driver.getDriver().get(ConfigReader.getProperty("registrationURL"));
    }

    @Given("user clicks on {string} button on the sign in page")
    public void user_clicks_on_button_on_the_sign_in_page(String string) {

        ReusableMethods.waitFor(1);
        Assert.assertTrue(medunnaLoginPage.cancel.isDisplayed());
        medunnaLoginPage.cancel.click();
    }

    @Given("user confirms going to {string} homepage")
    public void user_confirms_going_to_homepage(String string) {

        ReusableMethods.waitFor(1);
        medunnaLoginPage.cancel.click();
        Assert.assertTrue(medunnaLoginPage.cancel.isDisplayed());
        Driver.getDriver().get(ConfigReader.getProperty("medunnaHomePage"));
        medunnaLoginPage.singOut.click();

    }
    @Then("close the page")
    public void close_the_page() {

        Driver.closeDriver();
    }
   }
