package com.demoaut.tours.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoaut.newtours.pages.HomePage;
import com.demoaut.newtours.pages.Register_ConfirmationPage;
import com.demoaut.newtours.pages.RegistrationPage;
import com.demoaut.tours.utils.ExcelReadUtil;

public class RegisterForNewTours extends NewTours_BaseTest {

	HomePage hPage;
	RegistrationPage rPage;
	Register_ConfirmationPage rConfirmPage;

	@Test(enabled=true)
	public void registerTheUserProfile() {

		hPage = new HomePage(driver);
		rPage = new RegistrationPage(driver);
		SoftAssert softAssertion = null;
		rConfirmPage = new Register_ConfirmationPage(driver);

		String filePath = "./src/test/resources/RegistrationDetails.xls";
		ExcelReadUtil eru = new ExcelReadUtil(filePath, "Registration");
		// ExcelWriteUtil ewu = new ExcelWriteUtil(filePath, "Registration");

		for (int i = 1; i <= eru.getNoOfTotalRows(); i++) {

			hPage.clickOnRegisterLink();
			String firstName = eru.getCellValue(i, 0);
			String lastName = eru.getCellValue(i, 1);
			String phoneNumber = eru.getCellValue(i, 2);
			String email = eru.getCellValue(i, 3);
			String userName = eru.getCellValue(i, 4);
			String password = eru.getCellValue(i, 5);

			rPage.registerUserProfile(firstName, lastName, phoneNumber, email, userName, password);

			softAssertion = rConfirmPage.validateRegistration(userName);
			// ewu.WriteinToExcelString(i, 6, userName);

		}

		softAssertion.assertAll();

	}

}
