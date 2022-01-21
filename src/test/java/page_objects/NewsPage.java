package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsPage extends NavigationBar {
    private static final By BbcNews = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='News']");
    private static final By MoreTab = By.xpath("//span[@class='gel-long-primer gs-u-ph']");
    private static final By WorldsNewsTv = By.xpath("(//a[@class='nw-o-link'])[16]");
    private static final By HowToWatch = By.xpath("(//a[@class='gs-c-promo-heading gs-o-faux-block-link__overlay-link gel-pica-bold nw-o-link-split__anchor'])[4]");
    private static final By WatchBbcWorld = By.id("main-heading");

    private static final Logger LOGGER = LogManager.getLogger(NewsPage.class);
    public NewsPage(WebDriver driver) {
        super(driver);
    }


    public NewsPage ClickOnBbcNewsButton() {
        LOGGER.debug("User Clicks on the News Button");
        ActOn.element(driver, BbcNews).click();
        return this;
    }
        public NewsPage ClickOnMoreLink(){
        LOGGER.debug("User Clicks on the World News Tv Link");
        ActOn.element(driver, MoreTab).click();
        return this;
    }

    public NewsPage ClickOnWorldNewsTv() {
        LOGGER.debug("User Clicks on the More Link");
        ActOn.element(driver, WorldsNewsTv).click();
        return this;
    }
    public NewsPage ClickOnHowToWatch() {
        LOGGER.debug("User Clicks on the How to Watch Link");
        ActOn.element(driver, HowToWatch).click();
        return this;
    }

    public NewsPage PageHeadingValidation(){
        LOGGER.debug("User lands on the News Page");
        boolean CheckPageHeadingValidation = driver.findElement(WatchBbcWorld).isDisplayed();
        Assert.assertTrue("News Logo is Displayed on the page",CheckPageHeadingValidation);
        return this;
    }

}




