package com.demoaut.tours.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.demoaut.listeners.EventListeners;
import com.demoaut.newtours.constants.Constants;
import com.demoaut.tours.utils.ReadUtil;

public class NewTours_BaseTest implements Constants {

	WebDriver wDriver;

	EventFiringWebDriver driver;
	
	@Parameters({ "browser" })

	@BeforeMethod
	public void launchNewToursPage(@Optional(browser_Chrome)String browser) {
		
		String filePath = "./src/test/resources/config.properties";
		
		ReadUtil ru = new ReadUtil(filePath);
		
		String chromeDriver = ru.getPropertyValue(property_Chrome_Driver);
		String edgeDriver = ru.getPropertyValue(property_Edge_Driver);
		String chromeDriver_Path = ru.getPropertyValue(property_Chrome_Path);
		String edgeDriver_Path = ru.getPropertyValue(property_Edge_Path);
		String url = ru.getPropertyValue(property_Url);
		
		switch (browser) {
		case browser_Chrome:
			
			System.setProperty(chromeDriver,chromeDriver_Path);
			wDriver = new ChromeDriver();
			break;
		case browser_Edge:
			System.setProperty(edgeDriver,edgeDriver_Path);
			wDriver = new EdgeDriver();
			break;

		}

		driver = new EventFiringWebDriver(wDriver);
		
		EventListeners eListener = new EventListeners();
		driver.register(eListener);
		
		driver.get(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closeBrowser() {

		driver.close();
	}

}
