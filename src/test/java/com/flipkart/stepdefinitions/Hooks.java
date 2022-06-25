package com.flipkart.stepdefinitions;

import com.flipkart.resource.Commenactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commenactions{
	
	Commenactions action = new Commenactions ();
	
	@Before
	public void beforemethod() {
		System.out.println("Before every method");
		action.lanch();
	}
	
	@After
	public void aftermethod() {
		System.out.println("After every method");
		driver.quit();
	}

}
