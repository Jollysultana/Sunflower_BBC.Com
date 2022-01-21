package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.FuturePage;


public class FuturePageSteps {

    private static final Logger LOGGER = LogManager.getLogger(FuturePageSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User clicks on the Future Link to navigate the Future Page$")
    public void ClickOnBbcLogoButton() {
        new FuturePage(driver).ClickOnBbcLogoButton();
    }

    @And("^User clicks on the Future Planet Link and also clicks on the Load More Articles Button$")
    public void ClickOnFuturePlanetLink(){new FuturePage(driver).ClickOnFuturePlanetLink()
            .ClickOnLoadMoreArticlesButton();}

    @Then("^User validates the Future Page Successfully$")
    public void ValidateFuturePlanetPage(){
        new FuturePage(driver).ValidateFuturePlanetPage();
    }


}
