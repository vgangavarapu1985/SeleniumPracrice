package com.newtours.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.newtours.constants.Constants;
import com.newtours.utils.ReadUtil;

public class DriveFactory implements Constants {

	public static WebDriver driver;

	public void initializeDriver() {
		
		String filePath = filepath_Constant;
		ReadUtil ru = new ReadUtil(filePath);
		String property_browser = ru.getPropertyValue(property_Browser_Constant);
		String property_url = ru.getPropertyValue(property_BrowserUrl_Constant);
		String property_chromedriver_path = ru.getPropertyValue(property_ChromeDriverPath_Constant);

		switch (property_browser) {
		case "chrome":
			System.setProperty(chromedriver_type_constant, property_chromedriver_path);
			driver = new ChromeDriver();
			break;
		}

		driver.get(property_url);

		driver.manage().window().maximize();
		System.out.println("Completed the Initialize driver method");

	}

}
