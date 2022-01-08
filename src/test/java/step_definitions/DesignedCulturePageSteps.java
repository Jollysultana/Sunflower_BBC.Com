package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.DesignedCulturePage;

public class DesignedCulturePageSteps {


    private static final Logger LOGGER = LogManager.getLogger( DesignedCulturePageSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on the Culture Tab$")
    public void ClickOnCultureTab(){
        new DesignedCulturePage(driver).ClickOnCultureTab();
    }
    @And("^User clicks on the Designed Button$")
    public void ClickOnDesignedButton(){
        new DesignedCulturePage(driver).ClickOnDesignedButton();
    }
    @Then("^User lands on the Designed Page Successfully$")
    public void validateDesignedTitle(){
        new DesignedCulturePage(driver).validateDesignedTitle();
    }
}
