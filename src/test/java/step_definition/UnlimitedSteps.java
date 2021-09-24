package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.UnlimitedLink;

public class UnlimitedSteps {

    WebDriver driver = Hooks.driver;

    @When("^User click on plans$")
    public void userClickOnPlans() {
        new UnlimitedLink(driver).typePlans();
    }

    @And("^User click on unlimited button to select the items$")
    public void userClickOnUnlimited() {
        new UnlimitedLink(driver).typeUnlimited();
    }
    @Then("^user is navigate to  unlimited page$")
    public void navigateToUnlimitedPage() {
        new UnlimitedLink(driver).typeUnlimitedPage();
    }
}
