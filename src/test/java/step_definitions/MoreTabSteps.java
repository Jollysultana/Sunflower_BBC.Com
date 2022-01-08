package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.MoreTab;

public class MoreTabSteps {
    private static final Logger LOGGER = LogManager.getLogger(MoreTabSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User Mouse Hover to More Tab")
    public void mouseHoverToMoreTab(){
        new MoreTab(driver).mouseHoverToMoreTab();
    }
    @And("^User clicks on the Down Arrow Icon$")
    public void ClickOnDownArrowIcon(){
        new MoreTab(driver).ClickOnDownArrowIcon();
    }
    @Then("^User Land on the More Page Successfully$")
    public void ValidateMoreTitle(){
        new MoreTab(driver).ValidateMoreTitle();
    }





}
