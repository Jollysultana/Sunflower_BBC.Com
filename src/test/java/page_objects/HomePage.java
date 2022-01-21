package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends NavigationBar {
    private static final By BbcLogo = By.id("homepage-link");
    private static final By BbcWorldService = By.xpath("(//a[normalize-space()='BBC World Service'])[1]");
    private static final By PodcastsLink = By.xpath("//span[normalize-space()='Podcasts']");
    private static final By TrueCrimeNews = By.id("sc-id-true-crime");


    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage ClickOnBbcLogo() {
        LOGGER.debug("User clicks on the BBC Logo to land on the HomePage");
        ActOn.element(driver, BbcLogo).click();
        return this;
    }

    public HomePage ClickOnBbcWorldServiceLink() {
        LOGGER.debug("User clicks on the BBC World Service Link");
        ActOn.element(driver, BbcWorldService).click();
        return this;
    }

    public HomePage ClickOnPodcastsLink() {
        LOGGER.debug("User clicks on the Podcasts link");
        ActOn.element(driver, PodcastsLink).click();
        return this;
    }


    public HomePage ValidateTrueCrimeNewsPage() {
        LOGGER.debug("User can see the True crime News on the page");
        boolean CheckValidateTrueCrimeNewsPage = driver.findElement(TrueCrimeNews).isDisplayed();
        Assert.assertTrue("True crime News is Displayed on the page", CheckValidateTrueCrimeNewsPage);
        return this;
    }
}

