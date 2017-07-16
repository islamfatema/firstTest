package com.first.macCode.first.macCode.com;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class VerifyCreateAccount extends webDriverFactory {
	@Test
	public void creatAccount()throws InterruptedException{
		getDriver().findElement(By.id("u_0_m")).click();
		Thread.sleep(1000);
		
	}
	}
