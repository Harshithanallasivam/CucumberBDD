package com.bddelements.framework;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksTest {
	@Before
	public void testBefore() {
		System.out.println("Before Test");
	}
	@After
	public void testAfter() {
		System.out.println("After Test");
	}
	@Before ("@tag6 or @tag3")
	public void BeforeWithTag() {
		System.out.println("Before with tag");
	}
	@After ("@tag6 or @tag3")
	public void AfterWithTag() {
		System.out.println("After with tag");
	}
	@BeforeStep ()
	public void Beforethestep() {
		System.out.println("Before the each step");
	}
	@AfterStep ()
	public void Afterthestep() {
		System.out.println("Afte the each step");
	}

}
