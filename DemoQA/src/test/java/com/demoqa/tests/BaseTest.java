package com.demoqa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.demoqa.constants.Constants;
import com.demoqa.listeners.EventListener;
import com.demoqa.utils.ReadUtil;

public class BaseTest implements Constants {

	WebDriver wdriver;
	EventFiringWebDriver driver;
	
	@Parameters({ "browser" })
	@BeforeMethod
	public void LaunchDemoQAPage(@Optional(browser_Chrome) String browser) {
		
		String filePath = "./src/test/resources/config.properties";
		ReadUtil ru = new ReadUtil(filePath);
		
		String chromePath = ru.getPropertyValue(chrome_Path);
		String chromeDriver = ru.getPropertyValue(chrome_Driver);
		String edgePath = ru.getPropertyValue(edge_Path);
		String edgeDriver = ru.getPropertyValue(edge_Driver);
		String url = ru.getPropertyValue(browser_url);
		
		
		switch (browser) {
		case browser_Chrome:
			System.setProperty(chromeDriver,chromePath);

			wdriver = new ChromeDriver();
			break;
		case browser_Edge:
			System.setProperty(edgeDriver,edgePath);

			wdriver = new EdgeDriver();
			break;

		}

		driver = new EventFiringWebDriver(wdriver);
		EventListener eventListener = new EventListener();
		driver.register(eventListener);
		
		driver.navigate().to(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

	}

	@AfterMethod
	public void closeBrowsers() {
		driver.close();
	}

}
