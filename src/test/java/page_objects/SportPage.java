package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SportPage extends NavigationBar {
    private static final By BbcSport = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Sport']");
    public static final By SportLogo = By.xpath("//a[@class='sp-c-global-header__logo']");


    private static final Logger LOGGER = LogManager.getLogger(SportPage.class);
    public SportPage(WebDriver driver) {
        super(driver);
    }

    public SportPage ClickOnSportButton() {
        LOGGER.debug("Navigating to Sport Page");
        ActOn.element(driver, BbcSport).click();
        return this;
    }
    public SportPage ValidateSportTitle(){
        LOGGER.debug("User lands on the Sport Page");
        boolean CheckSportTitleValidation = driver.findElement(SportLogo).isDisplayed();
        Assert.assertTrue("Sport Title is Displayed on the page",CheckSportTitleValidation);
        return this;
    }


}
