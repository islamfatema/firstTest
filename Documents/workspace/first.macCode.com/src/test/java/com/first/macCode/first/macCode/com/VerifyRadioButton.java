package com.first.macCode.first.macCode.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyRadioButton  extends webDriverFactory{
	@Test
	public void verifyMobileLink()throws InterruptedException{
		getDriver().findElement(By.xpath("//table/tbody/tr[1]/td[5]")).click();
		Thread.sleep(1000);
		
	}
	}