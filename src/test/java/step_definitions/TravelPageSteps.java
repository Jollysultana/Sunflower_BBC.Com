package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.TravelPage;

public class TravelPageSteps {

    private static final Logger LOGGER = LogManager.getLogger(TravelPageSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on the Travel Link to navigate The Travel Page$")
    public void ClickOnTravelButton(){
        new TravelPage(driver).ClickOnTravelButton();
    }

    @And("^User clicks on the Discovery Link and also clicks on the Load More Button to load more new on the page")
    public void ClickOnTDiscoveryLink(){new TravelPage(driver).ClickOnTDiscoveryLink()
            .ClickOnLoadMoreButton();}

    @Then("^User Lands on the Travel Page Successfully$")
    public void validateTravelLogoSuccessfully(){
        new TravelPage(driver).validateTravelLogo();
    }

}
