package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchOption extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(SearchOption.class);
    private static final By ClickSearchIcon = By.id("gnav20-search-icon");
    private static final By TypeIPhone12 = By.xpath("//*[@id='gnav20-search-form']/p/input[@type='search'][@name='q']");

    public SearchOption(WebDriver driver) {
        super(driver);


    }
    public void typeClickSearchIcon() {
        LOGGER.debug("click on shop");
        ActOn.element(driver, ClickSearchIcon).click();
        ActOn.element(driver, TypeIPhone12).setValue("iPhone12");
        ActOn.element(driver, TypeIPhone12).getElement().sendKeys(Keys.ENTER);

    }


}
