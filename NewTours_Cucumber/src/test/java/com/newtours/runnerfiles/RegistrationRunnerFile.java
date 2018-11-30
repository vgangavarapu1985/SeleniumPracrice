package com.newtours.runnerfiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"C:\\Users\\sruth\\Desktop\\Kishore\\NewTours_Cucumber\\src\\test\\resources\\features\\registerprofile.feature"},
 glue={"com.newtours.stepdefinitions"},
 plugin= {"pretty","html:./target/report/cucumber/htmlreport","json:./target/report/cucumber/json/registerprofile.json"}
 )
public class RegistrationRunnerFile {

}
