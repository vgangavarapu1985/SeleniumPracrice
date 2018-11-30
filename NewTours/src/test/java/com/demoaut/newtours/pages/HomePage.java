package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	

	@FindBy(how=How.XPATH, using="//td/a[text()='SIGN-ON']")
	WebElement signOnLink;
	
	@FindBy(how=How.XPATH, using="//td/a[text()='REGISTER']")
	WebElement registerLink;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickOnRegisterLink()
	{
		//Find the Register Link and Click on it
		
		registerLink.click();

	}

	public void clickOnSignOnLink()
	{
		//Find the Sign-On Link and Click on it
		signOnLink.click();

	}

	
}
