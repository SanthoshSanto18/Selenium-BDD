package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefinitions", "hooks", "common",
        "pages" }, plugin = {
                "pretty", "html:target/cucumber-reports.html",
                "json:target/cucumber.json" }, monochrome = true,
        // tags = "@smk",
        dryRun = false)
public class TestRunner {
}
