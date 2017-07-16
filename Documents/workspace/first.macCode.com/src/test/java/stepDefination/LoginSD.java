package stepDefination;

import cucumber.api.java.en.Given;
import framework.HomePage;
import framework.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;
import framework.LoginPage;
import framework.TestRunner;
import org.testng.Assert;
public class LoginSD {

    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();

   @Given("^I am on home page$")
    public void iAmOnHomePage() {
        Assert.assertEquals(ShareSD.getDriver().getTitle(), "Facebook - Log In or Sign Up", "Invalid Home Page");
    }

    @When("^I enter (.+) into (username|password) text fields on home screen$")
    public void enterDataIntoTextFields(String text, String textFields) {

        switch (textFields) {
            case "username":
                homePage.enterEmail(text);
                break;
            case "password":
                homePage.enterPassword(text);
                break;
        }
        
    }

    @When("^I click on login button on home screen$")
    public void clickOnLoginButton() {
        homePage.clickOnLoginButton();
    }

    @Then("^I verify that i am an invalid login page$")
    public void verifyInvalidLoginPage() {
        Assert.assertEquals(loginPage.getPageHeader(), "Log into Facebook");
    }
 

  @Given("^I am on a home page$")
  public void IAmOnHomePage(){
	  Assert.assertEquals(ShareSD.getDriver().getTitle(), "Facebook - Log In or Sign Up", "Invalid Home Page");
	  
  } 
  @When("^I enter (.+) into (firstNameame|lastName|emailId|passWord) text fields on home screen$")
  public void entertextIntoTextFields(String text, String textFields) {

      switch (textFields) {
          case "firstName":
              homePage.enterFirstName(text);
              break;
          case "lastName":
        	  homePage.enterlastName(text);
              break;
          case "emailId" :
        	  homePage.enterMobileOremail(text);
        	  break;
          case "password":
        	  homePage.enterPasswordField(text);
        	  break;
      }
      

   
}}
