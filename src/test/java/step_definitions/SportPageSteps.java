package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.SportPage;

public class SportPageSteps {


    private static final Logger LOGGER = LogManager.getLogger(SportPageSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User clicks on the sport Link$")
    public void ClickOnSportButton(){
        new SportPage(driver).ClickOnSportButton();
    }


    @Then("^User Lands on the Sport Page Successfully$")
    public void validateSportTitleSuccessfully(){
        new SportPage(driver).ValidateSportTitle();
    }
}


