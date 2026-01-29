package RunnerFile_Cucumber;
 
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests    ;
@CucumberOptions(features= {"src/test/java/FeatureFile_Cucumber/"},
glue="StepDef_Cucumber",
tags="@tag1",
plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"junit:target/cucumber-report/CucumberTestReport.xml"
}
)
public class documentRun extends AbstractTestNGCucumberTests{
  
}