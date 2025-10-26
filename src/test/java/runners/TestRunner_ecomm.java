package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = { "stepDefinitions_ecomm" },
		plugin = { "pretty","html:target/cucumber-reports/cucumber-html-report.html"},
		monochrome = true,
		tags = "@Regression"
		)

public class TestRunner_ecomm extends AbstractTestNGCucumberTests {
}
