package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;



public class HomePageSteps {
    private static final Logger LOGGER = LogManager.getLogger(HomePageSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on the BBC Logo to land on the HomePage$")
    public void ClickOnBbcLogo(){
        new HomePage(driver)
                .ClickOnBbcLogo();
    }

    @And("Then user clicks on the BBC World Service Link and also clicks on the Podcasts link$")
    public void ClickOnBbcWorldServiceLink(){
        new HomePage(driver)
                .ClickOnBbcWorldServiceLink()
                .ClickOnPodcastsLink();
    }

    @Then("^User can see the True crime News on the page$")
    public void ValidateTrueCrimeNewsPage(){
        new HomePage(driver).ValidateTrueCrimeNewsPage();

    }

}
