package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
								features="classpath:features",
								glue = "steps",
								dryRun = false,
								monochrome = true,
								plugin = {
										"pretty",
										"html:target/cucumberreport.html",
										"json:target/report.json"
								})
public class Testing {

}
