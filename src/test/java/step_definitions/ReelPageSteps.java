package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.ReelPage;

public class ReelPageSteps {

    private static final Logger LOGGER = LogManager.getLogger(ReelPageSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User navigates to the Reel page$")
    public void ClickOnBbcReelButton(){
        new ReelPage(driver).ClickOnBbcReelLink();
    }

    @And("^User clicks on the PlayList Link and clicks on the watch now Button$")
    public void ClickOnPlayListLink(){
        new ReelPage(driver).ClickOnPlayListLink()
                .ClickOnWatchNowButton();
    }


    @Then("^User validates the Reel Page to watch the selected news$")
    public void validateReelTitleSuccessfully(){
        new ReelPage(driver).ValidateBbcReelPage();
    }
}


