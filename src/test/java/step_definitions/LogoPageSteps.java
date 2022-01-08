package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.LogoPage;



public class LogoPageSteps {
    private static final Logger LOGGER = LogManager.getLogger(LogoPageSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on the BBC Button$")
    public void ClickOnBbcLogo(){
        new LogoPage(driver).ClickOnBbcLogo();
    }
    @Then("^User lands on the BBC Welcome page successfully$")
    public void ValidateWelcomePageSuccessfully(){
        new LogoPage(driver).ValidateWelcomePage();

    }



}
