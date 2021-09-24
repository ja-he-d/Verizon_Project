package step_definition;
import command_providers.ActOn;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import page_object.Home;
import utilities.ReadConfigFiles;

public class VerizonSteps {

    WebDriver driver = Hooks.driver;


    @Given("^User is in verizon home page and click on shop$")
    public void userIsInVerizonHomepage() {
        String VerizonURL = ReadConfigFiles.getPropertyValue("VerizonURL");
        ActOn.browser(driver).openBrowser(VerizonURL);
        new Home(driver).typeShop();
    }
}
