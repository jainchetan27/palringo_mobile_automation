package stepdef;

import applications.App;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.ObjectInfo;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.OutputType;

import java.io.IOException;

public class StepDefinations {

    public static App application;
    public static boolean isScreenshotApplicable= true;

    @AfterStep
    public void quit(Scenario scenario) throws IOException {
        if(isScreenshotApplicable){
            byte[] screenshot = application.driver.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    }

    @Given("The app is launched {string}")
    public void theAppIsLaunched(String version) throws Exception {
        isScreenshotApplicable=true;
        application = new App(version);
        System.out.println("Application launched successfully "+version);
    }

    @Then("User should see the label as {string}")
    public void userShouldSeeTheLabelAs(String expectedValue) {
        isScreenshotApplicable=true;
        String actualValue = ObjectInfo.getLabelInfo(application.driver);
        System.out.println("Expected value="+expectedValue + " :: Actual value="+actualValue);
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(actualValue).isEqualTo(expectedValue);
        softAssertions.assertAll();
    }

    @When("User click on the button")
    public void userClickOnTheButton() {
        isScreenshotApplicable=true;
        ObjectInfo.buttonClickAction(application.driver);
        System.out.println("Click operation successful");
    }

    @And("User close the application")
    public void userCloseTheApplication() {
        isScreenshotApplicable=false;
        application.driver = null;
    }
}
