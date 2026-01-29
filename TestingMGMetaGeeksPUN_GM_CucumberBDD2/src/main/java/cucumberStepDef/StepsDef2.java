package cucumberStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class StepsDef2 {
	@ Given("I want to write a step with precondition")
	public void Step1() {
		System.out.println("I want to write a step with precondition");
	}
    @And("some other precondition")
    public void Step2() {
    	System.out.println("some other precondition");
    }

}
