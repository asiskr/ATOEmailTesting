package StepDefinition;
import com.asis.util.MainClass;

import Pages.XeroLoginPage;
import io.cucumber.java.en.*;

public class XeroLoginSteps {

	XeroLoginPage xerologinPage;
	
	@Given("User enter email and password")
	public void user_enter_email_and_password() {
		MainClass.setupDriver("Chrome");
		xerologinPage = new XeroLoginPage();
		MainClass.launchSite("https://login.xero.com");
	}

	@When("User click on Enter button")
	public void user_click_on_enter_button() {
		xerologinPage.enterUserId();
		xerologinPage.enterPassword();
		xerologinPage.clickLoginButton();
	}

	@Then("User pass security question")
	public void user_pass_security_question() {
		xerologinPage.clickAnotherAuthMethod();
		xerologinPage.clickSecurityQsn();
	}
}