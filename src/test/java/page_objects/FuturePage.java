package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FuturePage extends NavigationBar {
    private static final By BbcFuture= By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Future']");
    private static final By FuturePlanet = By.xpath("//p[@class='nav-label b-reith-sans-font'][normalize-space()='Future Planet']");
    private static final By LoadMoreArticles = By.xpath("//div[@class='load-more-button']");
    private static final By FuturePlanetLogo= By.xpath("//h2[@class='nav-build-bar__title-content b-font-family-serif nav-build-bar__title-content--desktop']");

    private static final Logger LOGGER = LogManager.getLogger(FuturePage.class);
    public FuturePage(WebDriver driver){super(driver);}



    public FuturePage ClickOnBbcLogoButton() {
        LOGGER.debug("Click on Future Button");
        ActOn.element(driver, BbcFuture).click();
        return this;
    }
    public FuturePage ClickOnFuturePlanetLink() {
        LOGGER.debug("Click on Future Planet Link");
        ActOn.element(driver, FuturePlanet).click();
        return this;
    }
    public FuturePage ClickOnLoadMoreArticlesButton() {
        LOGGER.debug("Click on Load More Articles Button");
        ActOn.element(driver, LoadMoreArticles).click();
        return this;
    }

    public FuturePage ValidateFuturePlanetPage(){
        LOGGER.debug("User lands on the Future Planet Page");
        boolean CheckFuturePlanetPageValidation = driver.findElement(FuturePlanet).isDisplayed();
        Assert.assertTrue("News Logo is Displayed on the page",CheckFuturePlanetPageValidation);
        return this;
    }


}

