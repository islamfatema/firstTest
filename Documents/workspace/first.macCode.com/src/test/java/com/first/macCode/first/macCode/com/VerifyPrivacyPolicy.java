package com.first.macCode.first.macCode.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyPrivacyPolicy extends webDriverFactory {
	@Test
	public void verifyCreatePage()throws InterruptedException{

		getDriver().findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/a")).click();
		Thread.sleep(1000);
		
	}
}