package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelPage extends NavigationBar{
    private static final By BbcTravel= By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Travel']");
    private static final By DiscoveryLink = By.xpath("(//p[@class='nav-label b-reith-sans-font'][normalize-space()='Discovery'])[1]");
    private static final By LoadMoreButton2 = By.xpath("(//span[@class='basic-button__text'])[1]");
    private static final By TravelLogo= By.xpath("(//*[name()='path'][@class='st0'])[6]");

    private static final Logger LOGGER = LogManager.getLogger(TravelPage.class);
    public TravelPage(WebDriver driver){super(driver);}

    public TravelPage ClickOnTravelButton() {
        LOGGER.debug("Navigating to Travel Page");
        ActOn.element(driver, BbcTravel).click();
        return this;
    }
    public TravelPage ClickOnTDiscoveryLink() {
        LOGGER.debug("Click on the Discovery Link");
        ActOn.element(driver,DiscoveryLink ).click();
        return this;
    }
    public TravelPage ClickOnLoadMoreButton() {
        LOGGER.debug("Click on the Load More Button");
        ActOn.element(driver, LoadMoreButton2).click();
        return this;
    }


    public TravelPage validateTravelLogo(){
        LOGGER.debug("User lands on the Travel Page");
        boolean CheckTravelTitleValidation = driver.findElement(TravelLogo).isDisplayed();
        Assert.assertTrue("Travel Title is Displayed on the page",CheckTravelTitleValidation);
        return this;
    }

}







