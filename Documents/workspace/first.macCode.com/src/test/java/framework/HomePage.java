package framework;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By firstNameTextField=By.id("u_0_2");
	private By lastNameTextField=By.id("u_0_4");
	private By mobileNumberOremailTextField=By.id("u_0_7" );
	private By getNewPassword=By.id("u_0_e");
	private By selectMonth=By.id("month");
	private By selectDay=By.id("day");
	private By selectYear=By.id("year");
	
	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		sendText(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		sendText(passwordTextField, enterPassword);
	}
	public void enterFirstName(String enterFirstName){
		sendFirstName(firstNameTextField, enterFirstName);
	}	
	public void enterlastName(String enterLastName){
		sendLastName(lastNameTextField ,enterLastName);
	}
	public void enterMobileOremail(String enterEmail){
		sendEmailId(mobileNumberOremailTextField, enterEmail);
	}
	public void enterPasswordField(String enterPasswordField){
		sendPasswordText(getNewPassword,enterPasswordField);
	}
	public void selectMonthFromDropDown(CharSequence[] index){
		selectTheMonth(selectMonth,index);
	}
}
