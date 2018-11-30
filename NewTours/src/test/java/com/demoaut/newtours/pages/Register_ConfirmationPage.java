package com.demoaut.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Register_ConfirmationPage {

	public WebDriver driver;

	@FindBy(how = How.XPATH, using = "//font[contains(text(),'Thank you for registering')]")
	WebElement registrationtext;

	public Register_ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SoftAssert validateUserName(String userName) {
		WebDriverWait wait = new WebDriverWait(driver,60);
		 WebElement userNameText;
		 userNameText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[contains(text(),'" + userName + "')]")));
		 
		//WebElement userNameText = driver.findElement(By.xpath("//b[contains(text(),'" + userName + "')]"));

		String expectedText = "Note: Your user name is " + userName + ".";

		SoftAssert softAssertion = new SoftAssert();
		// softAssertion.assertEquals(userNameText.getText() ,expectedText,
		// "Registration failed.Please check manually.");
		// softAssertion.assertTrue(userNameText.isDisplayed());
		softAssertion.assertEquals(userNameText.getText(), expectedText, "Registration failed.Please check manually.");
		System.out.println(userName + " UserName asertion executed");

		// Assert.assertEquals(userNameText.getText() ,expectedText, "Registration
		// failed.Please check manually.");

		return softAssertion;
	}

	public void validateText() {
		WebElement registrationtext = driver
				.findElement(By.xpath("//font[contains(text(),'Thank you for registering')]"));
		Assert.assertEquals(registrationtext.isDisplayed(), true,
				"Registration text is not showing correct.Please check manually.");

	}

	public SoftAssert validateRegistration(String userName) {
		validateText();
		SoftAssert softAssetion = validateUserName(userName);
		return softAssetion;
	}

}
