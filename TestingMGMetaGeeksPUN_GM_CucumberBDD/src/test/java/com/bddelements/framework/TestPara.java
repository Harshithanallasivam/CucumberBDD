package com.bddelements.framework;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestPara {
	@Given ("I want to write a step with {string}")
	public void testparam(String name){
		System.out.println(name);
	}
	@When ("I want to enter {int} is as idnum")
	public void testparam1(int idnum){
		System.out.println(idnum);
	}
	@And ("I want to enter {double} as salary")
	public void testparam2(double salary){
		System.out.println(salary);
	}
	
	@Given ("The user is in Login form")
	public void Login1(){
		System.out.println("The user is in Login form");
	}
	@When ("The user enters {string} in username field")
	public void Login2(String Username){
		System.out.println(Username);
	}
	@And ("The user enters {string} in password field")
	public void Login3(String Password){
		System.out.println(Password);
	}
	@And ("The user click on Login button")
	public void Login4(){
		System.out.println("he user click on Login button");
	}
	@Then ("The user get the status message as {string} in alert")
	public void Login5(String Status){
		System.out.println(Status);
	}


}
