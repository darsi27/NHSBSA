
package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\wales.feature" ,
				glue = "StepDefinitions" , dryRun = false , monochrome = true,//tags="@tag5",
				plugin = {"pretty","html:target\\Report.html","json:target\\Report.json",
				"junit:target\\Report.junit","rerun:target\\Rerun.txt"}

		)


public class CucumberRunnerTest {

}