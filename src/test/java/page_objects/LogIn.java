package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogIn extends NavigationBar {

    private static final By SignInLink = By.xpath("//span[@id='idcta-username']");
    private static final By InputEmail = By.id("user-identifier-input");
    private static final By Password = By.id("password-input");
    private static final By SignIn = By.xpath("//button[@id='submit-button']//span[contains(text(),'Sign in')]");
    private static final By InputInvalidEmail = By.id("user-identifier-input");
    private static final By InvalidPassword = By.id("password-input");

    private static final Logger LOGGER = LogManager.getLogger(LogIn.class);
    public LogIn(WebDriver driver) {
        super(driver);
    }

    public LogIn ClickOnSignInLink() {
        LOGGER.debug("User Clicks on the Sign in Link");
        ActOn.element(driver, SignInLink).click();
        return this;
    }
    public LogIn InputEmailAndPassword(String username, String password) {
        ActOn.element(driver, InputEmail).setValue(username);
        LOGGER.debug("User Types the Username and Password");
        ActOn.element(driver, Password).setValue(password);
        return this;
    }
    public LogIn ClickOnSignButton() {
        LOGGER.debug("User Clicks on the Sign in Button");
        ActOn.element(driver, SignIn).click();
        return this;
    }
    public LogIn InputInvalidEmailAndPassword(String username, String password) {
        ActOn.element(driver, InputInvalidEmail).setValue(username);
        LOGGER.debug("User Types the Invalid Username and Password");
        ActOn.element(driver, InvalidPassword).setValue(password);
        return this;
    }




}