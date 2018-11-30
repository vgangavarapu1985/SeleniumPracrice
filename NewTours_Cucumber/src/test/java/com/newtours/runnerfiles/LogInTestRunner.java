package com.newtours.runnerfiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	 features = {"./src/test/resources/features/login.feature"},
	 glue={"com.newtours.stepdefinitions"},
	 plugin= {"pretty","html:./target/report/cucumber/htmlreport","json:./target/report/cucumber/json/login.json"}
	 )
	 
	public class LogInTestRunner{
		//Testing for GitHub
	 
	}


