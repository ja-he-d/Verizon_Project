package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreePhonesLink extends NavigationBar {

    private static final Logger LOGGER = LogManager.getLogger(FreePhonesLink.class);

    private static final By Deals = By.id("gnav20-Shop-L2-2");
    private static final By FreePhones = By.id("gnav20-Shop-L3-40");
    private static final By FreePhonesPage = By.xpath("//h1[.='Free Phones | Shop at Verizon']");

    public FreePhonesLink(WebDriver driver) {
        super(driver);
    }

    public void typeDeals() {
        LOGGER.debug("click on deals");
        ActOn.element(driver, Deals).click();
    }

    public void typeFreePhones() {
        LOGGER.debug("click on FreePhones button to select the items");
        ActOn.element(driver, FreePhones).click();
    }

    public void typeFreePhonesPage() {
        LOGGER.debug("user is navigate to FreePhones page");
        ActOn.element(driver, FreePhonesPage).getElement();
    }
}
