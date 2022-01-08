package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReelPage extends NavigationBar {
    private static final By BbcReel = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Reel']");
    private static final By ReelTitle = By.xpath("//div[@class='css-1ojkkl5-Logo e14alb5n3']");


    private static final Logger LOGGER = LogManager.getLogger(ReelPage.class);
    public ReelPage(WebDriver driver) {
        super(driver);
    }

    public ReelPage ClickOnBbcReelLink() {
        LOGGER.debug("User Clicks on the Reel Button");
        ActOn.element(driver,BbcReel).click();
        return this;
    }
    public ReelPage ValidateBbcReelPage(){
        LOGGER.debug("User lands on the Reel Page");
        boolean CheckReelTitleValidation = driver.findElement(ReelTitle).isDisplayed();
        Assert.assertTrue("Reel Title is Displayed on the page",CheckReelTitleValidation);
        return this;
    }

}


