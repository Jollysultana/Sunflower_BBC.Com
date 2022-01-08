package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.FuturePage;


public class FuturePageSteps {

    private static final Logger LOGGER = LogManager.getLogger(FuturePageSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User clicks on the Future Button$")
    public void ClickOnFutureButton() {
        new FuturePage(driver).ClickOnFutureButton();
    }

    @Then("^User Lands on the Future Page Successfully$")
    public void validateFutureLogoSuccessfully(){
        new FuturePage(driver).ValidateFuturePage();
    }


}
