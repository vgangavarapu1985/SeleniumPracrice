package com.demoaut.tours.tests;

import org.testng.annotations.Test;

import com.demoaut.newtours.pages.DashboardPage;
import com.demoaut.newtours.pages.HomePage;
import com.demoaut.newtours.pages.SignOnPage;
import com.demoaut.tours.utils.ExcelReadUtil;

public class LogIntoNewTours extends NewTours_BaseTest {

	HomePage hPage;
	SignOnPage sPage;
	DashboardPage dPage;
	String filePath = "./src/test/resources/LoginScenarios.xls";

	@Test(groups = { "InvalidCredentials" })
	public void logInWithInvalidCredentials() {
		hPage = new HomePage(driver);
		sPage = new SignOnPage(driver);

		ExcelReadUtil eu = new ExcelReadUtil(filePath, "InvalidCredentials");

		for (int i = 1; i <= eu.getNoOfTotalRows(); i++) {
			hPage.clickOnSignOnLink();

			sPage.verifyAfterSignOn(eu.getCellValue(i, 0), eu.getCellValue(i, 1));

		}

	}

	@Test
	public void logInWithValidCredentials() {

		hPage = new HomePage(driver);
		sPage = new SignOnPage(driver);
		dPage = new DashboardPage(driver);

		ExcelReadUtil eu = new ExcelReadUtil(filePath, "ValidCredentials");
		for (int i = 1; i <= eu.getNoOfTotalRows(); i++) {

			hPage.clickOnSignOnLink();

			sPage.setUserName(eu.getCellValue(i, 0));
			sPage.setPassword(eu.getCellValue(i, 1));
			sPage.clickOnSubmitButton();

			dPage.verifyLogIn();

		}

	}

}
