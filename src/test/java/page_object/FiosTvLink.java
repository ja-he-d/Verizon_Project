package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FiosTvLink extends NavigationBar {

    private static final Logger LOGGER = LogManager.getLogger(FiosTvLink.class);
    private static final By Home = By.id("gnav20-Shop-L2-6");
    private static final By FiosTv = By.id("gnav20-Shop-L3-27");
    private static final By FiosTvPage = By.xpath("//h2[contains(.,'Fios TV Plans')]");

    public FiosTvLink(WebDriver driver) {
        super(driver);
    }
    public void typeHome() {
        LOGGER.debug("click on Home");
        ActOn.element(driver, Home).click();
    }

    public void typeFiosTv() {
        LOGGER.debug("click on fiosTv button to select the items");
        ActOn.element(driver, FiosTv).click();
    }

    public void typeFiosTvPage() {
        LOGGER.debug(" user is navigate to  FiosTv page");
        ActOn.element(driver, FiosTvPage).getElement();
    }
}
