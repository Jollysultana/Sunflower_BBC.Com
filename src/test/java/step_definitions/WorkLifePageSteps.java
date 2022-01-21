package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.WorkLifePage;

public class WorkLifePageSteps {
    private static final Logger LOGGER = LogManager.getLogger(WorkLifePageSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on the Work Life Button and user clicks on the Best Of 2021 Link$")
    public void ClickOnWorkLifeButton(){
        new WorkLifePage(driver).ClickOnWorkLifeButton()
                .ClickOnBestOf2021Link();
    }

    @And("^Then user clicks on the Remote Control Link and also clicks on the Load More Button to browse more news$")
    public void ClickOnBestOf2021Link(){
        new WorkLifePage(driver)
                .ClickOnRemoteControlLink()
                .ClickOnLoadMoreButton();
    }
    @Then("^User Stays on the Remote Control Page$")
    public void ValidateRemoteControlTitle(){
        new WorkLifePage(driver).ValidateRemoteControlTitle();
    }
}
