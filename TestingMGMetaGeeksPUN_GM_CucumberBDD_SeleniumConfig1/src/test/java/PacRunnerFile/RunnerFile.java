package PacRunnerFile;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests    ;
@CucumberOptions(features= {"src/test/java/PacFeatureFile/"},

tags="@tag1",
glue="PacStepDef",
plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"junit:target/cucumber-report/CucumberTestReport.xml"
}
)

public class RunnerFile extends AbstractTestNGCucumberTests {

}
