package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoreTab extends NavigationBar {
    private static final By MoreTab= By.xpath("//a[normalize-space()='More']");
    private static final By DownArrowIcon=By.className("istats-notrack");
    private static final By MoreTitle=By.id("orb-panel-more-title");


    private static final Logger LOGGER = LogManager.getLogger(page_objects.MoreTab.class);
    public MoreTab(WebDriver driver) {
        super(driver);
    }

    public page_objects.MoreTab mouseHoverToMoreTab() {
        LOGGER.debug("Mouse Hover to More Tab");
        ActOn.element(driver, MoreTab).mouseHover();
        return this;
    }
    public page_objects.MoreTab ClickOnDownArrowIcon() {
        LOGGER.debug("User Clicks on the Down Arrow Icon");
        ActOn.element(driver, DownArrowIcon).click();
        return this;
    }
    public page_objects.MoreTab ValidateMoreTitle() {
        LOGGER.debug("User lands on the More Page");
        boolean CheckMoreTitleValidation = driver.findElement(MoreTitle).isDisplayed();
        Assert.assertTrue("News Logo is Displayed on the page", CheckMoreTitleValidation);
        return this;
    }

}
