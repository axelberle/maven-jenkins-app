package support;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, dryRun = false, monochrome = false, plugin = { "html:target/site/cucumber-pretty",
		"json:target/cucumber.json" }, tags = { "@MVP1-5075" }, features = "src/test/resources/", glue = "stepdefs")
public class TestRunner {
}
