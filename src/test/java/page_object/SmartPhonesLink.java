package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmartPhonesLink extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(SmartPhonesLink.class);

    private static final By Deals = By.id("gnav20-Shop-L2-2");
    private static final By SmartPhones = By.id("gnav20-Shop-L3-42");
    private static final By SmartPhonesPage = By.xpath("//a[.='Smartphone ']");
    public SmartPhonesLink(WebDriver driver) {
        super(driver);
    }
        public void typeDeals() {
        LOGGER.debug("click on deals");
        ActOn.element(driver, Deals).click();
    }

    public void typeSmartPhones() {
        LOGGER.debug("click on SmartPhones button to select the items");
        ActOn.element(driver, SmartPhones).click();
    }

    public void typeSmartPhonesPage() {
        LOGGER.debug("user is navigate to FreePhones page");
        ActOn.element(driver, SmartPhonesPage).getElement();
    }
}
