package enersys.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html", // classic cucumber report
                "rerun:target/rerun.txt" , // failed test runner
                "me.jvt.cucumber.report.PrettyReports:target/cucumber", // pretty report
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" // allure report
        },
        features = "src/test/resources/features" ,
        glue = "enersys/steps",
        dryRun = false,
        tags = ""
)
public class TestRunner {
}