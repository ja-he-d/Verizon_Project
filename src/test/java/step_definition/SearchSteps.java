package step_definition;

import command_providers.ActOn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.Home;
import page_object.PrepaidPhonesLink;
import page_object.SearchOption;
import utilities.ReadConfigFiles;

public class SearchSteps {



    private static final Logger LOGGER = LogManager.getLogger(SearchSteps.class);
    WebDriver driver = Hooks.driver;


    @Given("^User is in verizon home page and click on search button$")
    public void userIsInVerizonHomepage() {
        String VerizonURL = ReadConfigFiles.getPropertyValue("VerizonURL");
        ActOn.browser(driver).openBrowser(VerizonURL);

    }
    @When("^User click on search button and type iPhone 12$")
    public void userClickOnSearchButtonAndTypeIPhone12() {
        new SearchOption(driver).typeClickSearchIcon();
    }
    @Then("^user press enter to get search results$")
    public void pressEnterToGetSearchResult() {
        new SearchOption(driver).typeClickSearchIcon();
    }

}
