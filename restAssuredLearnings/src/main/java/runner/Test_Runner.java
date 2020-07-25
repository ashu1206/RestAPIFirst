package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java",
		glue = {"stepDef"},
		tags = "@delete",
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json"
				},
		strict=true,
		
		dryRun = false
		)

public class Test_Runner {
	//"com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
