package tools.mawashi.cucumberexamples.simple;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(plugin = "pretty", features = { "src/test/resources/cucumbertests" })
@RunWith(Cucumber.class)
public class UserTest {
}
