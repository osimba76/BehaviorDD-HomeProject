package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	
	WebDriver driver;
	LoginPage loginpage;

	@Given("^I am on techfios site$")
	public void i_am_on_techfios_site() throws Throwable {
		driver=BrowserFactory.init();
		loginpage=PageFactory.initElements(driver, LoginPage.class);
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName("demo@techfios.com");
		loginpage.enterPassword("abc123");
	   
	}

	@When("^I click on sign in button$")
	public void i_click_on_sign_in_button() throws Throwable {
		loginpage.clickSignInButton();
	    throw new PendingException();
	}

	
}
