package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
features = {"src/test/resources/Background/background.feature"},
glue = {"StepDefinitions"},
plugin = {"pretty","html:target/report.html"}
		)

public class Background extends AbstractTestNGCucumberTests{

}
