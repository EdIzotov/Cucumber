package tools.mawashi.cucumberexamples.simple;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = {"src/test/resources/cucumbertests/studentapp"})
public class CreateStudentTest {
}
