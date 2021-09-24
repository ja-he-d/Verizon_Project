package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(Home.class);

    private static final By Shop = By.id("gnav20-Shop-L1");



    public Home(WebDriver driver) {
        super(driver);
    }

    public void typeShop() {
        LOGGER.debug("click on shop");
        ActOn.element(driver, Shop).click();
    }
}







