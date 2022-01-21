package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.CulturePage;

public class CulturePageSteps {
    private static final Logger LOGGER = LogManager.getLogger(CulturePageSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User clicks on the Culture Button to navigate the Culture Page$")
    public void ClickOnCultureButton(){
        new CulturePage(driver).ClickOnCultureButton();
    }

    @And("^User clicks on the Music Link and also click on the Load More Button to load more news$")
    public void ClickOnMusicLink(){new CulturePage(driver).ClickOnMusicLink()
            .ClickOnLoadMoreButton();}


    @Then("^User validates the Culture Logo to read newses from that page$")
    public void validateCultureLogoSuccessfully(){
        new CulturePage(driver).ValidateCultureLogo();
    }
}



