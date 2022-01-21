package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkLifePage extends NavigationBar{
    private static final By BbcWorkLife = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Worklife']");
    private static final By BestOf2021Link = By.xpath("(//p[normalize-space()='Best of 2021'])[1]");
    private static final By RemoteControlLink = By.xpath("//span[normalize-space()='Remote Control']");
    private static final By LoadMoreButton = By.xpath("(//span[@class='basic-button__text'])[1]");
    private static final By RemoteControlTitle = By.xpath("(//h2[normalize-space()='Remote Control'])[1]");


    private static final Logger LOGGER = LogManager.getLogger(WorkLifePage.class);
    public WorkLifePage(WebDriver driver){super(driver);
    }
    public WorkLifePage ClickOnWorkLifeButton() {
        LOGGER.debug("User clicks on the Work Life Button");
        ActOn.element(driver, BbcWorkLife).click();
        return this;
    }

    public WorkLifePage ClickOnBestOf2021Link() {
        LOGGER.debug("Then user clicks on the Best Of 2021 Link");
        ActOn.element(driver, BestOf2021Link).click();
        return this;
    }
    public WorkLifePage ClickOnRemoteControlLink() {
        LOGGER.debug("User clicks on the Remote Control Link");
        ActOn.element(driver, RemoteControlLink).click();
        return this;
    }
    public WorkLifePage ClickOnLoadMoreButton() {
        LOGGER.debug("User clicks on the Load More button to browse more news");
        ActOn.element(driver, LoadMoreButton).click();
        return this;
    }

    public WorkLifePage ValidateRemoteControlTitle() {
        LOGGER.debug("User Stays on the Remote Control Page");
        boolean CheckValidateRemoteControlTitle = driver.findElement(RemoteControlTitle).isDisplayed();
        Assert.assertTrue("News Logo is Displayed on the page", CheckValidateRemoteControlTitle);
        return this;
    }

}
