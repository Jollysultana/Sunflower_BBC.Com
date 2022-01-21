package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SportPage extends NavigationBar {
    private static final By BbcSport = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Sport']");
    public static final By AllSportButton = By.id("sp-nav-all-sport-button");
    public static final By BasketBallLink =  By.xpath("//a[@class='sp-c-sport-flyout__link qa-flyout-atoz-item sp-nav-click-stat'][normalize-space()='Basketball']");
    public static final By BasketBallTitle = By.xpath("//a[@role='menuitem'][normalize-space()='Basketball']");

    private static final Logger LOGGER = LogManager.getLogger(SportPage.class);
    public SportPage(WebDriver driver) {
        super(driver);
    }

    public SportPage ClickOnSportButton() {
        LOGGER.debug("Navigating to Sport Page");
        ActOn.element(driver, BbcSport).click();
        return this;
    }
    public SportPage ClickOnAllSportButton() {
        LOGGER.debug("Click on the All Sport Button");
        ActOn.element(driver, AllSportButton).click();
        return this;
    }
    public SportPage ClickOnBasketBallLink() {
        LOGGER.debug("Click on the BasketBall Link");
        ActOn.element(driver,BasketBallLink ).click();
        return this;
    }

    public SportPage ValidateBasketBallTitle(){
        LOGGER.debug("User lands on the BasketBall Page");
        boolean CheckBasketBallTitleValidation = driver.findElement(BasketBallTitle).isDisplayed();
        Assert.assertTrue(" BasketBall Title is Displayed on the page",CheckBasketBallTitleValidation);
        return this;
    }


}
