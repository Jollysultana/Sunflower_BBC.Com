package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.WorkLifePage;

public class WorkLifePageSteps {
    private static final Logger LOGGER = LogManager.getLogger(WorkLifePageSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on the WorkLife Button$")
    public void ClickOnWorkLifeButton(){
        new WorkLifePage(driver).ClickOnWorkLifeButton();
    }
    @Then("^User Lands on the WorkLife Page Successfully$")
    public void validateWorkLifeLogoSuccessfully(){
        new WorkLifePage(driver).ValidateWorkLifeLogo();
    }
}
