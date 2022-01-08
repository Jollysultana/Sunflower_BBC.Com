package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DesignedCulturePage extends NavigationBar {
    private static final By BbcCultureTwice = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Culture']");
    private static final By CultureDesigned = By.xpath("//p[normalize-space()='Designed']");
    private static final By DesignedTitle = By.xpath("(//h2[normalize-space()='designed'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(DesignedCulturePage.class);

    public DesignedCulturePage(WebDriver driver) {
        super(driver);
    }


    public DesignedCulturePage ClickOnCultureTab() {
        LOGGER.debug("User clicks on the Culture Tab");
        ActOn.element(driver, BbcCultureTwice).click();
        return this;
    }

    public DesignedCulturePage ClickOnDesignedButton(){
        LOGGER.debug("User clicks on the Designed Button");
        ActOn.element(driver,CultureDesigned).click();
        return this;
    }
    public DesignedCulturePage validateDesignedTitle(){
        LOGGER.debug("User lands on the Designed Page");
        boolean CheckDesignedTitleValidation = driver.findElement(DesignedTitle).isDisplayed();
        Assert.assertTrue("Designed Title is Displayed on the page",CheckDesignedTitleValidation);
        return this;
    }



}