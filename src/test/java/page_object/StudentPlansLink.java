package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentPlansLink extends NavigationBar {
    private static final Logger LOGGER =  LogManager.getLogger(SmartPhonesLink.class);


    private static final By Plans = By.id("gnav20-Shop-L2-5");
    private static final By StudentPlans = By.id("gnav20-Shop-L3-20");
    private static final By StudentPlansPage = By.xpath("//h2[normalize-space()='Students save with Unlimited plans.']");
    public StudentPlansLink(WebDriver driver) {
        super(driver);
    }
    public void typePlans() {
        LOGGER.debug("click on Plans");
        ActOn.element(driver, Plans).click();
    }
    public void typeStudentPlans() {
        LOGGER.debug("click on studentPlans button to select the items");
        ActOn.element(driver, StudentPlans).click();
    }
    public void typeStudentPlansPage() {
        LOGGER.debug(" user is navigate to  unlimited page");
        ActOn.element(driver, StudentPlansPage).getElement();
    }
}
