package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkLifePage extends NavigationBar{
    private static final By BbcWorkLife = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Worklife']");
    private static final By WorkLifeLogo = By.xpath("//span[@class='branding__icon branding__icon--worklife branding__icon--large']//*[name()='svg']");

    private static final Logger LOGGER = LogManager.getLogger(WorkLifePage.class);
    public WorkLifePage(WebDriver driver){super(driver);
    }
    public WorkLifePage ClickOnWorkLifeButton() {
        LOGGER.debug("Navigating to WorkLife Page");
        ActOn.element(driver, BbcWorkLife).click();
        return this;
    }
    public WorkLifePage ValidateWorkLifeLogo() {
        LOGGER.debug("User lands on the WorkLife Page");
        boolean CheckWorkLifeLogoValidation = driver.findElement(WorkLifeLogo).isDisplayed();
        Assert.assertTrue("News Logo is Displayed on the page", CheckWorkLifeLogoValidation);
        return this;
    }

}
