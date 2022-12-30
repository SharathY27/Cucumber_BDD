package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleDemo {

	@Given("user is entering username and password in login page")
	public void user_is_entering_username_and_password_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside login page");
	}

	@When("user is clicking enter after giving credentials")
	public void user_is_clicking_enter_after_giving_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clickig enter in login page");
	}

	@When("user should be able to login")
	public void user_should_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logging in");
	}

	@Then("user should get feeds on facebook page")
	public void user_should_get_feeds_on_facebook_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside facebook page");
	}
}
