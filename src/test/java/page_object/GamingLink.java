package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GamingLink extends NavigationBar {

    private static final Logger LOGGER = LogManager.getLogger(GamingLink.class);
    private static final By Entertainment = By.id("gnav20-Shop-L2-7");
    private static final By Gaming = By.id("gnav20-Shop-L3-36");
    private static final By GamingPage = By.xpath("//h2[contains(@class,'u-fontDisplay u-textLineHeightExtraTight u-colorSecondary u-text--xs40 u-text--md56 u-text--xl64 u-marginBottom--xs16')]");

    public GamingLink(WebDriver driver) {
        super(driver);
    }
    public void typeEntertainment() {
        LOGGER.debug("click on Entertainment");
        ActOn.element(driver, Entertainment).click();
    }

    public void typeGaming() {
        LOGGER.debug("click on gaming button to select the items");
        ActOn.element(driver, Gaming).click();
    }

    public void typeGamingPage() {
        LOGGER.debug(" user is navigate to gaming page");
        ActOn.element(driver, GamingPage).getElement();
    }
}
