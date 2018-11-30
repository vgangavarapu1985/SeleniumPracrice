package com.newtours.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DriveFactory {
	
	@Before
	public void setUP()
	{
		System.out.println("You are in Hooks Before Tag");
		initializeDriver();
	}
	
	@After
	public void closeBrowsers()
	{
		System.out.println("You are in Hooks After Tag");
		driver.close();
	}

}
