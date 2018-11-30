package com.mortgagecalculator.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.mortgaecalculator.datadriven.ExcelData;
import com.mortgaecalculator.functions.ProjectFunctions;

public class Test1 {

	ProjectFunctions pFunctions;
	@Test
	public void calculatePMI() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sruth\\Desktop\\Kishore\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mortgagecalculator.org/");

		driver.manage().window().maximize();
		
		pFunctions = new ProjectFunctions(driver);
		
		String filePath ="./src/test/resources/PMITestData.xls";
		String sheetName = "PMIData";
		
		ExcelData ed = new ExcelData(filePath, sheetName);
		
		int noOfRows = ed.getNoOfRows();
		
		for (int i=1; i<=noOfRows; i++)
		{
			
			System.out.println("Enter the Homevalue textbox value");
			pFunctions.findTextboxByIDAndEnterData("homeval", ed.getCellValue(i,0));
			
			System.out.println("Enter the DownPayment textbox value");
			pFunctions.findTextboxByIDAndEnterData("downpayment", ed.getCellValue(i,1));
			
			System.out.println("Enter the Intrest rate textbox value");
			pFunctions.findTextboxByIDAndEnterData("intrstsrate", ed.getCellValue(i,2));
			
			System.out.println("Enter the LoanTerm textbox value");
			pFunctions.findTextboxByIDAndEnterData("loanterm", ed.getCellValue(i,3));
			
			System.out.println("Select the Month value from Dropdown");
			pFunctions.selectTheDropdownValue("param[start_month]", ed.getCellValue(i,4));
			
			System.out.println("Enter the Year textbox value");
			pFunctions.findTextboxByIDAndEnterData("start_year", ed.getCellValue(i,5));
			
			System.out.println("Enter the Property Tax textbox value");
			pFunctions.findTextboxByIDAndEnterData("pptytax", ed.getCellValue(i,6));
			
			System.out.println("Enter the PMI textbox value");
			pFunctions.findTextboxByIDAndEnterData("pmi", ed.getCellValue(i,7));
			
			System.out.println("Enter the HOI textbox value");
			pFunctions.findTextboxByIDAndEnterData("hoi", ed.getCellValue(i,8));
			
			System.out.println("Enter the HOA textbox value");
			pFunctions.findTextboxByIDAndEnterData("hoa", ed.getCellValue(i,9));
			
			System.out.println("Select Loan Type value from dropdown");
			WebElement Loantype = driver.findElement(By.name("param[refiorbuy]"));
			Select select = new Select(Loantype);
			select.selectByIndex(Integer.parseInt(ed.getCellValue(i,10)));
			
			System.out.println("Click on Calculate Button");
			pFunctions.clickOnButtonByValue("Calculate");
	
		}
		
				
	}

}
