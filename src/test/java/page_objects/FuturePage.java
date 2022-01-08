package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FuturePage extends NavigationBar {
    private static final By BbcFuture= By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Future']");
    private static final By FutureLogo= By.id("Layer_1");

    private static final Logger LOGGER = LogManager.getLogger(FuturePage.class);
    public FuturePage(WebDriver driver){super(driver);}



    public FuturePage ClickOnBbcLogoButton() {
        LOGGER.debug("Click on Future Button");
        ActOn.element(driver, BbcFuture).click();
        return this;
    }

    public FuturePage ValidateFuturePage(){
        LOGGER.debug("User lands on the BBC Welcome Page");
        boolean CheckFutureLogoValidation = driver.findElement(FutureLogo).isDisplayed();
        Assert.assertTrue("News Logo is Displayed on the page",CheckFutureLogoValidation);
        return this;
    }


}

