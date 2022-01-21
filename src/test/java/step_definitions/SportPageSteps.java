package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.SportPage;

public class SportPageSteps {


    private static final Logger LOGGER = LogManager.getLogger(SportPageSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User clicks on the sport Link$")
    public void ClickOnSportButton(){
        new SportPage(driver).ClickOnSportButton();
    }

    @And("User clicks on the All Sport Button")
    public void ClickOnAllSportButton(){new SportPage(driver).ClickOnAllSportButton();}

    @And("User clicks on the BasketBall Button")
    public void ClickOnBasketBallLink(){new SportPage(driver).ClickOnBasketBallLink();}

    @Then("^User Lands on the BasketBall Page Successfully$")
    public void ValidateBasketBallTitle(){
        new SportPage(driver).ValidateBasketBallTitle();
    }
}


