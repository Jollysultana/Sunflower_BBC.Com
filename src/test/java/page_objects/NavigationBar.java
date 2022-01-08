package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private static final By BbcLogo = By.id("homepage-link");
    private static final By SignInLink = By.xpath("//span[@id='idcta-username']");
    private static final By BbcNews = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='News']");
    private static final By BbcReel = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Reel']");
    private static final By BbcSport = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Sport']");
    private static final By BbcWorkLife = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Worklife']");
    private static final By BbcTravel= By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Travel']");
    private static final By BbcFuture= By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Future']");
    private static final By BbcCulture= By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Culture']");
    private static final By MoreTab= By.xpath("//a[normalize-space()='More']");
    private static final By BbcCultureTwice=By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Culture']");
    private static final By BbcNews2 = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='News']");


    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);
    public WebDriver driver;
    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }


    public NavigationBar ClickOnBbcLogo() {
        LOGGER.debug("Navigating to BBC Logo");
        ActOn.element(driver, BbcLogo).click();
        return this;
    }

    public NewsPage ClickOnBbcNewsButton() {
        LOGGER.debug("Navigating to BBC News");
        ActOn.element(driver, BbcNews).click();
        return new NewsPage(driver);
    }

    public LogIn ClickOnSignInLink() {
        LOGGER.debug("Navigating to Sign in Page");
        ActOn.element(driver, SignInLink).click();
        return new LogIn(driver);
    }
    public ReelPage ClickOnBbcReelLink() {
        LOGGER.debug("Navigating to Reel Page");
        ActOn.element(driver, BbcReel).click();
        return new ReelPage(driver);
    }
    public SportPage ClickOnSportButton(){
        LOGGER.debug("Navigating to Sport Page");
        ActOn.element(driver,BbcSport).click();
        return new SportPage(driver);

    }
    public WorkLifePage ClickOnWorkLifeButton(){
        LOGGER.debug("Navigating to WorkLife Page");
        ActOn.element(driver,BbcWorkLife).click();
        return new WorkLifePage(driver);

    }
    public TravelPage ClickOnTravelButton(){
        LOGGER.debug("Navigating to Travel Page");
        ActOn.element(driver,BbcTravel).click();
        return new TravelPage(driver);
    }
    public FuturePage ClickOnFutureButton(){
        LOGGER.debug("Navigating to Future Page");
        ActOn.element(driver,BbcFuture).click();
        return new FuturePage(driver);
    }

    public CulturePage ClickOnCultureButton() {
        LOGGER.debug("Navigating to Culture Page");
        ActOn.element(driver, BbcCulture).click();
        return new CulturePage(driver);
    }
    public page_objects.MoreTab mouseHoverToMoreTab() {
        LOGGER.debug("Mouse Hover to More Tab");
        ActOn.element(driver, MoreTab).mouseHover();
        return new MoreTab(driver);
    }
    public DesignedCulturePage ClickOnCultureTab(){
        LOGGER.debug("User clicks on the Culture Tab");
        ActOn.element(driver,BbcCultureTwice).click();
        return new DesignedCulturePage(driver);
    }
    public WorldPage ClickOnBbcNewsTab () {
        LOGGER.debug("Navigating to BBC Tab");
        ActOn.element(driver, BbcNews2).click();
        return new WorldPage(driver);
    }

}