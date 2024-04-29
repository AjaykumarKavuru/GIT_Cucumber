package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",features = {"src/test/resources/Features/login_with_POM.feature"},
glue = {"StepDefinitions"},
plugin = {"pretty","html:target/report.html"})
public class POMLoginTestRunner extends AbstractTestNGCucumberTests{

}
