package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.SafetyLink;

public class SafetySteps {
    WebDriver driver = Hooks.driver;

    @When("^User click on apps$")
    public void userClickOnApps() {
        new SafetyLink(driver).typeApps();
    }

    @And("^User click on safety button to select the items$")
    public void userClickOnSafety() {
        new SafetyLink(driver).typeSafety();
    }


    @Then("^user is navigate to a scroll page$")
    public void navigateToSafetyPage() {
        new SafetyLink(driver).typeSafetyPage();
    }
}
