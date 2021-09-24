package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.GamingLink;


public class GamingSteps {
    WebDriver driver = Hooks.driver;

    @When("^User click on entertainment$")
    public void userClickOnEntertainment() {
        new GamingLink(driver).typeEntertainment();
    }

    @And("^User click on gaming button to select the items$")
    public void userClickOnGaming() {
        new GamingLink(driver).typeGaming();
    }
    @Then("^user is navigate to gaming page$")
    public void navigateToGamingPage() {
        new GamingLink(driver).typeGamingPage();
    }
}
