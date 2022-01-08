package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.WorldPage;

public class WorldPageSteps {

    private static final Logger LOGGER = LogManager.getLogger(WorldPageSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User Clicks on the News Tab$")
    public void ClickOnBbcNewsTab(){
        new WorldPage(driver).ClickOnBbcNewsTab();
    }
    @And("^User Clicks on the World Button$")
    public void ClickOnWorldButton(){
        new WorldPage(driver).ClickOnWorldButton();
    }
    @Then("^User Lands on the World Page Successfully$")
    public void ValidateWorldTitle(){
        new WorldPage(driver).ValidateWorldTitle();
    }
}





