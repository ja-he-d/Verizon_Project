package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChargingLink extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(ChargingLink.class);

    private static final By Accessories = By.id("gnav20-Shop-L2-4");
    private static final By Charging = By.id("gnav20-Shop-L3-52");
    private static final By ChargingPage = By.xpath("//h1[contains(.,'Charging')]");

    public ChargingLink(WebDriver driver) {
        super(driver);
    }
    public void typeAccessories() {
        LOGGER.debug("click on accessories");
        ActOn.element(driver, Accessories).click();
    }

    public void typeCharging() {
        LOGGER.debug("click on charging button to select the items");
        ActOn.element(driver, Charging).click();
    }

    public void typeChargingPage() {
        LOGGER.debug(" user is navigate to  charging page");
        ActOn.element(driver, ChargingPage).getElement();
    }
}
