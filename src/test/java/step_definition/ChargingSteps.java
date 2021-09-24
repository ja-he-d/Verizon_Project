package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.ChargingLink;


public class ChargingSteps {
    WebDriver driver = Hooks.driver;

    @When("^User click on accessories for charging items$")
    public void userClickOnAccessoriesForCharger() {
        new ChargingLink(driver).typeAccessories();
    }

    @And("^User click on charging button to select the items$")
    public void userClickOnCharging() {
        new ChargingLink(driver).typeCharging();
    }
    @Then("^user is navigate to  charging page$")
    public void navigateToChargingPage() {
        new ChargingLink(driver).typeChargingPage();
    }
}
