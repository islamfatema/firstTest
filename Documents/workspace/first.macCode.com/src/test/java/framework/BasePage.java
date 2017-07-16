package framework;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import stepDefination.ShareSD;

/**
 * Created by mohammadmuntakim on 6/9/17.
 */
public class BasePage {

	public void clickOn(By locator) {
		try {
			ShareSD.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public void sendText(By locator, String text) {
		try {
			ShareSD.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = ShareSD.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}
	public void sendFirstName(By locator,String text){
		try{
		ShareSD.getDriver().findElement(locator).sendKeys(text);}
		catch (NoSuchElementException e){
			Assert.fail("Element is not found with this locator "+locator.toString());
		}
	}public void sendLastName(By locator,String text){
		try{ShareSD.getDriver().findElement(locator).sendKeys(text);}
		catch(NoSuchElementException e){
			Assert.fail("Element is not found with this locator "+locator.toString());
		}
	}public void sendEmailId(By locator,String text){
		try{ShareSD.getDriver().findElement(locator).sendKeys(text);}
		catch(NoSuchElementException e){
			Assert.fail("Element is not found with this locator "+locator.toString());
		}
	}public void sendPasswordText(By locator,String text){
		try{ShareSD.getDriver().findElement(locator).sendKeys(text);}
		catch(NoSuchElementException e){
			Assert.fail("Element is not found with this locator "+locator.toString());
		}
	}public void selectTheMonth(By locator,CharSequence[] index){
		Select dropDown=new Select(null);
		dropDown.selectByIndex(4);
		try{ShareSD.getDriver().findElement(locator).sendKeys(index);}
		catch(NoSuchElementException e){
		Assert.fail("Element is not found with this locator "+locator.toString());	
		}
	}

	public void clickOnBrowserBackArrow() {
		ShareSD.getDriver().navigate().back();
	}

	public void clickOnBrowserForwardArrow() {
		ShareSD.getDriver().navigate().forward();
	}

	public void refreshBrowser() {
		ShareSD.getDriver().navigate().refresh();
	}
}
