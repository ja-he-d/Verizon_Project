package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.FiosTvLink;


public class FiosTvSteps {
    WebDriver driver = Hooks.driver;

    @When("^User click on home$")
    public void userClickOnHome() {
        new FiosTvLink(driver).typeHome();
    }

    @And("^User click on fiosTv button to select the items$")
    public void userClickOnFiosTv() {
        new FiosTvLink(driver).typeFiosTv();
    }
    @Then("^user is navigate to  FiosTv page$")
    public void navigateToFiosTvPage() {
        new FiosTvLink(driver).typeFiosTvPage();
    }
}
