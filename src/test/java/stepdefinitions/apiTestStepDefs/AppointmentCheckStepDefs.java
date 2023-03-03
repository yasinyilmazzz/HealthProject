package stepdefinitions.apiTestStepDefs;
import base_url.AppBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointments;
import pojos.Patient;
import static io.restassured.RestAssured.given;
import static utilities.PatientGenerateToken.generateToken;
public class AppointmentCheckStepDefs extends AppBaseUrl {

    @Given("User send post request for appointment")
    public void user_send_post_request_for_appointment() {
        //Set the url
        spec.pathParams("first", "api", "second", "appointments");

        // Set the expected date
        Patient patient=new Patient(null,null,5974,"emre","team2",null,null,null,null,null,null,null);
        Appointments appointments= new Appointments(null,null,null,"2023-03-10T00:00:00Z","2023-03-11T01:00:00Z","UNAPPROVED",null,null,null,null,null,null,null);
        //String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbnRlYW0wMiIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjc3OTEyMDczfQ.LGcKhg1jdzwdgQ1Z_NRgiIBQ1N0bD-icW8nTMX2mKoBKpMS5XM4YtE0ufPWhaBQZSEYtRGcg6feO6KiZBl5wJg";
        //Send the request and get the response

        Response response = given().
                spec(spec).
                contentType(ContentType.JSON).
                header("Authorization","Bearer "+generateToken()).
                body(appointments).
                when().
                post("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("user send fetch request to change start date")
    public void user_send_fetch_request_to_change_start_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user verify to start date changed")
    public void user_verify_to_start_date_changed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}