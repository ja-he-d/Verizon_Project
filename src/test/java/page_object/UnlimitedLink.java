package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnlimitedLink extends NavigationBar {

    private static final Logger LOGGER = LogManager.getLogger(UnlimitedLink.class);

    private static final By Plans = By.id("gnav20-Shop-L2-5");
    private static final By Unlimited = By.id("gnav20-Shop-L3-13");
    private static final By UnlimitedPage = By.xpath("//h2[contains(.,'It’s Unlimited built right'.)]");
    public UnlimitedLink(WebDriver driver) {
        super(driver);
    }
    public void typePlans() {
        LOGGER.debug("click on Plans");
        ActOn.element(driver, Plans).click();
    }

    public void typeUnlimited() {
        LOGGER.debug("click on unlimited button to select the items");
        ActOn.element(driver, Unlimited).click();
    }

    public void typeUnlimitedPage() {
        LOGGER.debug(" user is navigate to  unlimited page");
        ActOn.element(driver, UnlimitedPage).getElement();
    }
}
