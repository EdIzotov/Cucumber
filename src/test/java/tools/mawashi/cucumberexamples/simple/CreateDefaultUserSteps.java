package tools.mawashi.cucumberexamples.simple;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDefaultUserSteps {
    private WebDriver driver = new ChromeDriver();
    private String name;
    private String phone;
    @Given("user {string} with {string} has to be created")
    public void userWithDataHasToBeCreated(String name, String phone) {
        driver.get("http://37.59.228.229:3000/");
        driver.findElement(By.cssSelector("i.mdi-content-add")).click();
        this.name = name;
        this.phone = phone;
    }

    @When("name and phone were entered and Create button was clicked")
    public void name_and_phone_were_entered_and_Create_button_was_clicked() {
        driver.findElement(By.cssSelector("div.main-content input#icon_prefix")).clear();
        driver.findElement(By.cssSelector("div.main-content input#icon_prefix")).sendKeys(name);
        driver.findElement(By.cssSelector("div.main-content input#icon_telephone")).clear();
        driver.findElement(By.cssSelector("div.main-content input#icon_telephone")).sendKeys(phone);
        driver.findElement(By.cssSelector("div.main-content a.save-btn")).click();
    }

    @Then("user Vasya Petrov with {int} and role Student appears in the list")
    public void user_Vasya_Petrov_with_and_role_Student_appears_in_the_list(Integer int1) {
        //
    }
}
