package W_runner;

import io.cucumber.core.plugin.PrettyFormatter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Dell\\eclipse2-workspace\\Cucumber\\src\\test\\java\\fearures\\Login.feature"},
		glue = {"stepDefnitions"},
		monochrome = false,
		dryRun = false,
		plugin = {"pretty","html:reports\\Login.html"}
		
		
		
		
		)
public class Runner_login extends AbstractTestNGCucumberTests
{

}
 