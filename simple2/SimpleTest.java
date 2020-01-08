package tools.mawashi.cucumberexamples.simple2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = { "src/test/java/tools/mawashi/cucumberexamples/simple2" })
public class SimpleTest {
}
