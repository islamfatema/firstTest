package com.first.macCode.first.macCode.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class webDriverFactory {
	private static WebDriver driver = null;
	private String uRL = "https://www.facebook.com/";

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass

	public void initializeDriver() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get(uRL);

	}
	@AfterClass

	public void tearDown() throws InterruptedException {

		if (driver != null) {
			driver.manage().deleteAllCookies();
			Thread.sleep(1000);
			driver.quit();
		}

}}
