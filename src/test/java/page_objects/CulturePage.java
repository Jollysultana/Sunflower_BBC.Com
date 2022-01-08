package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CulturePage extends NavigationBar {
    private static final By BbcCulture= By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Culture']");
    private static final By CultureLogo= By.xpath("(//*[name()='polygon'][@class='st0'])[3]");

    private static final Logger LOGGER = LogManager.getLogger(CulturePage.class);
    public CulturePage(WebDriver driver) {
        super(driver);
    }

    public CulturePage ClickOnCultureButton() {
        LOGGER.debug("Navigating to Culture Page");
        ActOn.element(driver, BbcCulture).click();
        return this;
    }
    public CulturePage ValidateCultureLogo(){
        LOGGER.debug("User lands on the Culture Page");
        boolean CheckCultureLogoValidation = driver.findElement(CultureLogo).isDisplayed();
        Assert.assertTrue("Culture Logo is Displayed on the page",CheckCultureLogoValidation);
        return this;
    }



}
