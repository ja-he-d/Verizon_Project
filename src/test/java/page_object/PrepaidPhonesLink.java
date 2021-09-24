package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrepaidPhonesLink extends NavigationBar {

    private static final Logger LOGGER = LogManager.getLogger(PrepaidPhonesLink.class);
    private static final By Devices = By.id("gnav20-Shop-L2-3");
    private static final By PrepaidPhones = By.id("gnav20-Shop-L3-4");
    private static final By PrepaidPhonesPage = By.xpath("//h1[.='Prepaid Smartphones']");


    public PrepaidPhonesLink(WebDriver driver) {
        super(driver);
    }
    public void typeDevices() {
        LOGGER.debug("click on devices");
        ActOn.element(driver, Devices).click();
    }

    public void typePrepaidPhones() {
        LOGGER.debug("click on PrepaidPhones button to select the items");
        ActOn.element(driver, PrepaidPhones).click();
    }

    public void typePrepaidPhonesPage() {
        LOGGER.debug("user is navigate to a PrepaidPhones page");
        ActOn.element(driver, PrepaidPhonesPage).getElement();
    }
}
