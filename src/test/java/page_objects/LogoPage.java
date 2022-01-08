package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoPage extends NavigationBar  {
    private static final By BbcLogo = By.id("homepage-link");
    private static final By BbcWelcomePage=By.xpath("//span[normalize-space()='Welcome to BBC.com']");

    private static final Logger LOGGER = LogManager.getLogger(LogoPage.class);
    public LogoPage(WebDriver driver) {super(driver);}

    public LogoPage ClickOnBbcLogo() {
        LOGGER.debug("Navigating to BBC Logo");
        ActOn.element(driver, BbcLogo).click();
        return new LogoPage(driver);
    }
    public LogoPage ValidateWelcomePage() {
        LOGGER.debug("User lands on the News Page");
        boolean CheckBbcWelcomePageValidation = driver.findElement(BbcWelcomePage).isDisplayed();
        Assert.assertTrue("News Logo is Displayed on the page", CheckBbcWelcomePageValidation);
        return this;
    }
}
