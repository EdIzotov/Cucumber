package tools.mawashi.cucumberexamples.simple;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNull;

public class UserSteps {
    private User user = new User();

    @Given("^that the user (.*) is given a task to clear (.*) certification exam$")
    public void certificationName(String name, String certification) {
        user.setName(name);
        user.setCertification(certification);
    }

    @When("^(.*) got (\\d+) marks in exam$")
    public void gotMarks(String name, int marks) {
        assertThat(name, is(user.getName()));
        user.setMarks(marks);
    }

    @Then("^(.*) is known as (.*) certified$")
    public void certifiedYes(String name, String certification) {
        assertThat(name, is(user.getName()));
        assertThat(user.getCertification(), equalTo("QA"));
        assertThat(user.getResults(), is(true));
    }
    @Then("^(.*) is not known as (.*) certified$")
    public void certifiedNo(String name, String certification) {
        assertThat(name, is(user.getName()));
        user.setCertification(null);
        assertNull(user.getCertification());
        assertThat(user.getResults(), is(false));
    }
}
