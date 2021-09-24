package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import page_object.SmartPhonesLink;

public class SmartPhonesSteps {
    WebDriver driver = Hooks.driver;

    @When("User click on deals for SmartPhones")
    public void userClickOnDealsForSmartPhones() {
        new SmartPhonesLink(driver).typeDeals();
    }

    @And("^User click on SmartPhones button to select the items$")
    public void userClickOnSmartPhones() {
        new SmartPhonesLink(driver).typeSmartPhones();
    }

    @Then("^user is navigate to a SmartPhones page$")
    public void navigateToSmartPhonesPage() {
        new SmartPhonesLink(driver).typeSmartPhonesPage();
    }


}
