package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_scenarios.txt", glue = { "stepDefinitions_ecomm" }, plugin = { "pretty",
		"html:target/cucumber-reports/ecomm/html-report.html", "json:target/cucumber-reports/ecomm/json-report.json",
		"junit:target/cucumber-reports/ecomm/junit-report.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true)

public class FailedRunner_ecomm extends AbstractTestNGCucumberTests {
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios(){ return
	 * super.scenarios(); }
	 */

	// Can enable parallel execution by using the above code
}