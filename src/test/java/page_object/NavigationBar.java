package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);

    private final By VerizonLogo = By.xpath("//a[contains(@title,'Verizon Home Page') and @class='gnav20-logoWhiteBg']");


    public WebDriver driver;
    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }





    // Navigate to Home Page
    public Home navigateToHome() {
        LOGGER.debug("Navigating to Home Page");
        ActOn.element(driver, VerizonLogo).click();
        return new Home(driver);
    }


}
