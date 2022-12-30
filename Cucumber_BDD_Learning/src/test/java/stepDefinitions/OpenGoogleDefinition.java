package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class OpenGoogleDefinition {

	WebDriver driver;
	
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			System.out.println("onnu");
		driver = new ChromeDriver();
		System.out.println("onnu1");
		driver.get("http://www.google.co.in");
		System.out.println("onnu3");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("^user is entering the search term as \"([^\"]*)\"$")
	public void user_is_entering_the_search_term_as(String searchTerm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		WebDriver driver;
//		driver = new ChromeDriver();
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	 
	}

	@When("^click the search button or enter in keyboard$")
	public void click_the_search_button_or_enter_in_keyboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		WebDriver driver;
//		driver = new ChromeDriver();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^user able to get the search results$")
	public void user_able_to_get_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("success");
		driver.quit();
	 
	}
}
