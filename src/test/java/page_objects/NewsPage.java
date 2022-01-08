package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsPage extends NavigationBar {
    private static final By BbcNews = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='News']");
    private static final By NewsLogo = By.xpath("//a[@id='brand']//span[1]//*[name()='svg']");

    private static final Logger LOGGER = LogManager.getLogger(NewsPage.class);
    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public NewsPage ClickOnBbcNewsButton() {
        LOGGER.debug("User Clicks on the News Button");
        ActOn.element(driver,BbcNews).click();
        return this;
    }
    public NewsPage ValidateNewsLogo(){
        LOGGER.debug("User lands on the News Page");
        boolean CheckBbcNewsLogoValidation = driver.findElement(NewsLogo).isDisplayed();
        Assert.assertTrue("News Logo is Displayed on the page",CheckBbcNewsLogoValidation);
        return this;
    }

}




