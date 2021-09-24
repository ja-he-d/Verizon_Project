package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.PrepaidPhonesLink;

public class PrepaidPhonesSteps {
    WebDriver driver = Hooks.driver;

    @When("^User click on devices for PrepaidPhones$")
    public void userClickOnDevicesForPrepaidPhones() {
        new PrepaidPhonesLink(driver).typeDevices();
    }

    @And("^User click on PrepaidPhones button to select the items$")
    public void userClickOnPrepaidPhones() {
        new PrepaidPhonesLink(driver).typePrepaidPhones();
    }

    @Then("^user is navigate to a PrepaidPhones page$")
    public void navigateToPrepaidPhonesPage() {
        new PrepaidPhonesLink(driver).typePrepaidPhonesPage();
    }
}
