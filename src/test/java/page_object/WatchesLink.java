package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WatchesLink extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(WatchesLink.class);

    private static final By Devices = By.id("gnav20-Shop-L2-3");
    private static final By Watches = By.id("gnav20-Shop-L3-10");
    private static final By WatchesPage = By.xpath("//h1[.='Connected Smart Watches']");
    public WatchesLink(WebDriver driver) {
        super(driver);
    }
    public void typeDevices() {
        LOGGER.debug("click on devices");
        ActOn.element(driver, Devices).click();
    }
    public void typeWatches() {
        LOGGER.debug("click on watches button to select the items");
        ActOn.element(driver, Watches).click();
    }

    public void typeWatchesPage() {
        LOGGER.debug(" user is navigate to a Watches page");
        ActOn.element(driver, WatchesPage).getElement();
    }
}
