package com.first.macCode.first.macCode.com;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {
	private By setLocator;

	public void setLocatorValue(By locator) {
		setLocator = locator;
	}
	public void clickOnButton(){
		clickTheButton(setLocator);
	}
}