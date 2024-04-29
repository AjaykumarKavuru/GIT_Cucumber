package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke and @regression and not @perf ",
features = {"src/test/resources/Feature_Tags"},
glue = {"StepDefinitions"},
plugin = {"pretty","html:target/report.html"})
public class Tags extends AbstractTestNGCucumberTests{

}
