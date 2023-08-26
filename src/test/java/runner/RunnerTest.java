package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				, "html:target/cucumber/report.html"
				, "summary"
				, "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		,features = {"src/test/resources"}
		,glue = {"stepdef"}
		,snippets = CAMELCASE
		,dryRun=false
		,monochrome=true
)

public class RunnerTest{

}
