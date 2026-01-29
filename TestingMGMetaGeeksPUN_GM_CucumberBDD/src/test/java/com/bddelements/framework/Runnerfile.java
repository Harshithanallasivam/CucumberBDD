package com.bddelements.framework;
 
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests    ;
@CucumberOptions(features= {"src/test/java/com/bddelements/framework/"},
glue="com.bddelements.framework",
tags="@tag7 or @tag6 or @tag3",
plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json"
}
)
public class Runnerfile extends AbstractTestNGCucumberTests{
  
}