package com.newtours.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.newtours.pages.DashboardPage;
import com.newtours.pages.HomePage;
import com.newtours.pages.SignOnPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInStepDefinition extends DriveFactory {

	HomePage hPage;
	SignOnPage sPage;
	DashboardPage dPage;
	

	@Given("^: user open the browser and load the url$")
	public void user_open_the_browser_and_load_the_url() throws Exception {
		
		hPage = new HomePage(driver);
		sPage = new SignOnPage(driver);
		dPage = new DashboardPage(driver);
	}
	
	@Then("^: home page is displayed$")
	public void home_page_is_displayed() throws Exception {
		hPage.verifyHomePageDisplayed();
	}

	@When("^: user clicks on Log In Link$")
	public void user_clicks_on_Log_In_Link() throws Exception {

		hPage.clickOnLoginLink();
	}

	@When("^: enter User name \"([^\"]*)\"$")
	public void enter_User_name(String userName) throws Exception {
		sPage.setUserName(userName);

	}

	@When("^: enter Password \"([^\"]*)\"$")
	public void enter_Password(String password) throws Exception {
		sPage.setPassword(password);
	}

	@When("^: click on Login Link$")
	public void click_on_Login_Link() throws Exception {
		sPage.clickOnSubmitButton();
	}

	@Then("^: validate DashBoard Page displayed\\.$")
	public void validate_DashBoard_Page_displayed() throws Exception {
		dPage.dashBoardPageDisplayed();
	}
}
