package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.StudentPlansLink;

public class StudentPlansSteps {
    WebDriver driver = Hooks.driver;

    @When("^User click on plans for health studentPlans$")
    public void userClickOnPlans() {
        new StudentPlansLink(driver).typePlans();
    }

    @And("^User click on studentPlans button to select the items$")
    public void userClickOnUnlimited() {
        new StudentPlansLink(driver).typeStudentPlans();
    }
    @Then("^user is navigate to studentPlans page$")
    public void navigateToUnlimitedPage() {
        new StudentPlansLink(driver).typeStudentPlansPage();
    }
}

