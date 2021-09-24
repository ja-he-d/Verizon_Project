package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.WatchesLink;

public class WatchesSteps {
    WebDriver driver = Hooks.driver;

    @When("^User click on devices for Watches$")
    public void userClickOnDevicesForWatches() {
        new WatchesLink(driver).typeDevices();
    }
    @And("^User click on watches button to select the items$")
    public void userClickOnWatches() {
        new WatchesLink(driver).typeWatches();
    }

    @Then("^user is navigate to a Watches page$")
    public void navigateToWatchesPage() {
        new WatchesLink(driver).typeWatchesPage();
    }
}
