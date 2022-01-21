package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.NewsPage;
import utilities.ReadConfigFiles;

public class NewsPageSteps {
    private static final Logger LOGGER = LogManager.getLogger(NewsPageSteps.class);
    WebDriver driver = Hooks.driver;

    @Given("^A user is on the Home Page$")
    public void NavigateToHomePage(){
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("BBCHomeURL"));
        LOGGER.info("User is on the Home Page");

    }
    @When("^User clicks on the News Button and clicks on the More Link$")
    public void ClickOnNewsButton(){
        new NewsPage(driver)
                .ClickOnBbcNewsButton()
                .ClickOnMoreLink();
    }

    @And("Then user clicks on the World News Tv Link and also clicks on the How To Watch Link$")
    public void  ClickOnWorldNewsTv(){
        new NewsPage(driver)
                .ClickOnWorldNewsTv()
                .ClickOnHowToWatch();
    }

    @Then("^User Lands on the Where and how to watch BBC World News Page Successfully$")
    public void PageHeadingValidation(){
        new NewsPage(driver).PageHeadingValidation();
    }
}





