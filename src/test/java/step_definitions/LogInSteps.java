package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LogInSteps {
    private static final By SignInLink = By.xpath("//span[@id='idcta-username']");
    private static final By InputEmail = By.id("user-identifier-input");
    private static final By Password = By.id("password-input");
    private static final By SignInButton = By.xpath("//button[@id='submit-button']//span[contains(text(),'Sign in')]");
    private static final By InputInvalidEmail = By.id("user-identifier-input");
    private static final By InvalidPassword = By.id("password-input");

    private static final Logger LOGGER = LogManager.getLogger(LogInSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User clicks on the Sign in Link")
    public void ClickOnSignInLink() {
        ActOn.element(driver, SignInLink).click();
        LOGGER.info("User is on the Sign in Page");
    }

    @And("^User enters username \"(.+?)\"$")
    public void enterEmailId(String username){
        ActOn.element(driver,InputEmail ).setValue(username);

    }
    @And("^User enters password \"(.+?)\"$")
    public void enterUserCredentials(String password ) {
        ActOn.element(driver, Password).setValue(password);
        LOGGER.info("User has entered credentials");
    }

    @Then("^User clicks on the Sign in Button$")
    public void ClickOnSignButton() {
        ActOn.element(driver, SignInButton).click();
        LOGGER.info("User clicked on the Sign in button");
    }

    @And("^User enters Invalid username \"(.+?)\"$")
    public void enterInvalidEmailId(String username){
        ActOn.element(driver,InputInvalidEmail).setValue(username);

    }
    @And("^User enters Invalid password \"(.+?)\"$")
    public void enterInvalidPassword(String password ) {
        ActOn.element(driver, InvalidPassword).setValue(password);
        LOGGER.info("User has entered credentials");
    }
    @Then("^User Failed to log in$")
    public void ClickOnTheSignButton() {
        ActOn.element(driver, SignInButton).click();
        LOGGER.info("User is still on the Log In Page");
    }


}


