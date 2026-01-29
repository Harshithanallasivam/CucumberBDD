package cucumberRunnerFile;
 
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests    ;
@CucumberOptions(features= {"src/test/java/cucumberFeatureFie/"},
glue="cucumberStepDef",
tags="@tag7",
plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"junit:target/cucumber-report/CucumberTestReport.xml"
}
)
public class Runnerfile extends AbstractTestNGCucumberTests{
  
}