package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/api_features",
        glue = {"stepdefinitions"},
        tags="@US08"
)
public class PatientRunner {
}