package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.SearchBox;

public class SearchBoxSteps {
    private static final Logger LOGGER = LogManager.getLogger(SportPageSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User types Game on the Search Box$")
    public void TypeOnSearchBox(){
        new SearchBox(driver).TypeOnSearchBox("Game");
    }

    @And("^User clicks on the Search Icon$")
    public void ClickOnSearchIcon(){
        new SearchBox(driver).ClickOnSearchIcon();
    }
    @Then("^User Validates the Page to read Games News$")
    public void ValidateSearchInput(){
        new SearchBox(driver).ValidateSearchInput();}


}
