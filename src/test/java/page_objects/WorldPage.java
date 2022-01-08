package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorldPage extends NavigationBar {
    private static final By BbcNews2 = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='News']");
    private static final By WorldLPage = By.xpath("(//span[contains(text(),'World')])[1]");
    private static final By WorldTitle=By.xpath("//span[@class='gel-great-primer gs-u-display-inline-block gs-u-mv']");

    private static final Logger LOGGER = LogManager.getLogger(WorldPage.class);
    public WorldPage(WebDriver driver) {
        super(driver);
    }

    public WorldPage ClickOnBbcNewsTab() {
        LOGGER.debug("User Clicks on the News Tab");
        ActOn.element(driver,BbcNews2).click();
        return this;
    }
    public WorldPage ClickOnWorldButton() {
        LOGGER.debug("User Clicks on the World Button");
        ActOn.element(driver, WorldLPage).click();
        return this;
    }

    public WorldPage ValidateWorldTitle(){
        LOGGER.debug("User lands on the World Page");
        boolean CheckWorldLogoValidation = driver.findElement(WorldTitle).isDisplayed();
        Assert.assertTrue("World Title is Displayed on the page",CheckWorldLogoValidation);
        return this;
    }

}




