package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.ReelPage;

public class ReelPageSteps {

    private static final Logger LOGGER = LogManager.getLogger(ReelPageSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User clicks on the Reel Link$")
    public void ClickOnBbcReelButton(){
        new ReelPage(driver).ClickOnBbcReelLink();
    }


    @Then("^User Lands on the Reel Page Successfully$")
    public void validateReelTitleSuccessfully(){
        new ReelPage(driver).ValidateBbcReelPage();
    }
}


