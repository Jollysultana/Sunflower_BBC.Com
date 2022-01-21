package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends NavigationBar{
    private static final By TypeSearchBox = By.id("orb-search-q");
    private static final By SearchIcon= By.id("orb-search-button");
    private static final By SearchInput = By.id("search-input");
    // private static final By ClicksGameOfFame = By.xpath("(//a[@class='ssrcss-atl1po-PromoLink e1f5wbog0'])[2]");
    //private static final By ClickOnListenNow = By.className("playout__messagetext");
    //private static final By SoundsLogo = By.className("sc-c-sounds-nav__brand-svg");

    private static final Logger LOGGER = LogManager.getLogger(SearchBox .class);
    public SearchBox (WebDriver driver) {
        super(driver);
    }

    public SearchBox TypeOnSearchBox(String value) {
        LOGGER.debug("Typing on the Search Box");
        ActOn.element(driver,TypeSearchBox ).setValue("Game");
        return this;
    }
    public SearchBox ClickOnSearchIcon() {
        LOGGER.debug("Click on the Search Icon");
        ActOn.element(driver, SearchIcon).click();
        return this;
    }
//    public SearchBox ClicksGameOfFameLink() {
//        LOGGER.debug("Click on the Game Of Fame Link");
//        ActOn.element(driver,ClicksGameOfFame).click();
//        return this;
//    }
//    public SearchBox ClickOnListenNowBox() {
//        LOGGER.debug("Click on the Listen Now Box");
//        ActOn.element(driver, ClickOnListenNow).click();
//        return this;
//    }
    public SearchBox ValidateSearchInput() {
        LOGGER.debug("User lands on the Games News Page");
        boolean CheckGamesNewsValidation = driver.findElement(SearchInput).isDisplayed();
        Assert.assertTrue("Culture Logo is Displayed on the page", CheckGamesNewsValidation);
        return this;
    }

}
