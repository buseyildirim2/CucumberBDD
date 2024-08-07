package enersys.steps;

import enersys.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before
    public void setupMethod(){

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO ");
    }

    @After
    public void tearDown(Scenario scenario){

        // Take screenshot of the current state of the browser
        if (scenario.isFailed()){

            // Attach the screenshot to the scenario report
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        }

        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");

        Driver.closeDriver();

    }

}
