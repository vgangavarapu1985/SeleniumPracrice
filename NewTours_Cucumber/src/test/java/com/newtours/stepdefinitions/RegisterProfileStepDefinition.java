package com.newtours.stepdefinitions;

import com.newtours.pages.HomePage;
import com.newtours.pages.RegisterPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterProfileStepDefinition extends DriveFactory {

	HomePage hPage = new HomePage(driver);
	RegisterPage rPage = new RegisterPage(driver);

	@Then("^: Home Page is displayed$")
	public void home_Page_is_displayed() throws Exception {
		hPage.verifyHomePageDisplayed();

	}

	@When("^: user clicks on Register Button$")
	public void user_clicks_on_Register_Button() throws Exception {
		hPage.clickOnRegisterLink();

	}

	@Then("^: Register page displayed$")
	public void register_page_displayed() throws Exception {

		rPage.registerPageDisplayed();
	}

	@When("^: enter First Name ([^\"]*)$")
	public void enter_First_Name(String firstName) throws Exception {
		rPage.setFirstName(firstName);

	}

	@When("^: enter Last Name ([^\"]*)$")
	public void enter_Last_Name(String lastName) throws Exception {
		rPage.setLastName(lastName);

	}

	@When("^: enter Phone ([^\"]*)$")
	public void enter_Phone(String phone) throws Exception {
		rPage.setPhone(phone);

	}

	@When("^: enter email ([^\"]*)$")
	public void enter_email(String email) throws Exception {
		rPage.setEmail(email);

	}

	@When("^: enter address ([^\"]*)$")
	public void enter_address(String address) throws Exception {
		rPage.setAddress(address);

	}

	@When("^: enter city ([^\"]*)$")
	public void enter_city(String city) throws Exception {
		rPage.setCity(city);

	}

	@When("^: enter state ([^\"]*)$")
	public void enter_state(String state) throws Exception {
		rPage.setState(state);

	}

	@When("^: enter postal code ([^\"]*)$")
	public void enter_postal_code(String postCode) throws Exception {
		rPage.setPostCode(postCode);

	}

	@When("^: enter country ([^\"]*)$")
	public void enter_country(String countryValue) throws Exception {
		rPage.setCountry(countryValue);

	}

	@When("^: enter username ([^\"]*)$")
	public void enter_username(String userName) throws Exception {
		rPage.setUserName(userName);

	}

	@When("^: enter password ([^\"]*)$")
	public void enter_password(String password) throws Exception {
		rPage.setPassword(password);

	}

	@When("^: enter confirm password ([^\"]*)$")
	public void enter_confirm_password(String password) throws Exception {
		rPage.setConfirmPassword(password);

	}

	@When("^: click on submit button$")
	public void click_on_submit_button() throws Exception {
		rPage.clickOnSubmitButton();

	}

	@Then("^: Registration completed successfully\\.$")
	public void registration_completed_successfully() throws Exception {
		// Write code here that turns the phrase above into concrete actions

	}

}
