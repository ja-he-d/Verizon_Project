package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.FreePhonesLink;

public class FreePhonesSteps {
    WebDriver driver = Hooks.driver;


    @When("User click on deals for free phones")
    public void userClickOnDealsForFReePhones() {
        new FreePhonesLink(driver).typeDeals();
    }

    @And("^User click on FreePhones button to select the items$")
    public void userClickOnFreePhones() {
        new FreePhonesLink(driver).typeFreePhones();
    }
    @Then("^user is navigate to FreePhones page$")
    public void navigateToFreePhonesPage() {
        new FreePhonesLink(driver).typeFreePhonesPage();
    }
}
