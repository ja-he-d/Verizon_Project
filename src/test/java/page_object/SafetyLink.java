package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SafetyLink extends NavigationBar {

    private static final Logger LOGGER = LogManager.getLogger(GamingLink.class);
    private static final By Apps = By.id("gnav20-Shop-L2-8");
    private static final By Safety = By.id("gnav20-Shop-L3-61");
    private static final By SafetyPage = By.xpath("//h2[contains(.,'Safety')]");

    public SafetyLink(WebDriver driver) {
        super(driver);
    }
    public void typeApps() {
        LOGGER.debug("click on Apps");
        ActOn.element(driver, Apps).click();
    }

    public void typeSafety() {
        LOGGER.debug("click on safety button to select the items");
        ActOn.element(driver, Safety).click();
    }

    public void typeSafetyPage() {
        LOGGER.debug(" user is navigate to a scroll page");
        ActOn.element(driver, SafetyPage).getElement();
    }
}
