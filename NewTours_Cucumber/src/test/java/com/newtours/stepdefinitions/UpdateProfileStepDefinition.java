package com.newtours.stepdefinitions;

import com.newtours.pages.DashboardPage;
import com.newtours.pages.HomePage;
import com.newtours.pages.ProfilePage;
import com.newtours.pages.SignOnPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateProfileStepDefinition extends DriveFactory {

	HomePage hPage;
	SignOnPage sPage;
	DashboardPage dPage;
	ProfilePage pPage;

	@Given("^user open the browser and load the new tours application url$")
	public void user_open_the_browser_and_load_the_new_tours_application_url() throws Exception {
		hPage = new HomePage(driver);
		sPage = new SignOnPage(driver);
		dPage = new DashboardPage(driver);
		pPage = new ProfilePage(driver);

	}

	@Then("^verify home page displayed$")
	public void verify_home_page_displayed() throws Exception {
		hPage.verifyHomePageDisplayed();

	}

	@When("^click on Sign-On link$")
	public void click_on_Sign_On_link() throws Exception {
		hPage.clickOnLoginLink();

	}

	//@When("^enter user name \"([^\"]*)\"$")
	@When("^enter user name ([^\"]*)$")
	public void enter_user_name(String userName) throws Exception {
		sPage.setUserName(userName);

	}

	@When("^enter password ([^\"]*)$")
	public void enter_password(String password) throws Exception {
		sPage.setPassword(password);
		sPage.clickOnSubmitButton();

	}

	@Then("^verify dashboard page displayed$")
	public void verify_dashboard_page_displayed() throws Exception {
		dPage.dashBoardPageDisplayed();

	}

	@When("^user click on Profile link$")
	public void user_click_on_Profile_link() throws Exception {
		dPage.clickOnProfileLink();
	}

	@Then("^profile page should be displayed$")
	public void profile_page_should_be_displayed() throws Exception {
		pPage.verifyprofilePageDisplayed();

	}

	@When("^enter First name ([^\"]*)$")
	public void enter_First_name(String firstName) throws Exception {
		pPage.setFirstName(firstName);

	}

	@When("^enter Last name ([^\"]*)$")
	public void enter_Last_name(String lastName) throws Exception {
		pPage.setLastName(lastName);

	}

	@When("^enter Phone ([^\"]*)$")
	public void enter_Phone(String phone) throws Exception {
		pPage.setPhone(phone);

	}

	@When("^enter Email ([^\"]*)$")
	public void enter_Email(String email) throws Exception {
		pPage.setEmail(email);

	}

	@When("^enter Address ([^\"]*)$")
	public void enter_Address(String address) throws Exception {
		pPage.setAddress(address);

	}

	@When("^enter City ([^\"]*)$")
	public void enter_City(String city) throws Exception {
		pPage.setCity(city);

	}

	@When("^enter State ([^\"]*)$")
	public void enter_State(String state) throws Exception {
		pPage.setState(state);

	}

	@When("^enter Postal Code ([^\"]*)$")
	public void enter_Postal_Code(String postCode) throws Exception {
		pPage.setPostCode(postCode);

	}

	@When("^enter Country ([^\"]*)$")
	public void enter_Country(String countryValue) throws Exception {
		pPage.setCountry(countryValue);

	}

	@When("^click on Submit Button$")
	public void click_on_Submit_Button() throws Exception {
		pPage.clickOnSubmitButton();

	}

}