package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithExamples {

	WebDriver driver;
	
	@Given("Now the user is on login page in OrangeHRM website")
	public void now_the_user_is_on_login_page_in_orange_hrm_website() throws InterruptedException {
	    
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    
	}

	@When("now the user is enters username {string} and password {string} in  OrangeHRM website")
	public void now_the_user_is_enters_username_admin_and_password_admin123_in_orange_hrm_website(String username,String password) {
		 
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
	    
	}

	@When("now the user click on login button OrangeHRM website")
	public void now_the_user_click_on_login_button_orange_hrm_website() {
	    
		driver.findElement(By.xpath("//button[text()[normalize-space()='Login']]")).click();
	}

	  @Then("now the user is navigated to home page OrangeHRM website") public void
	  now_the_user_is_navigated_to_home_page_orange_hrm_website() {
	  
	  driver.quit(); 
	  }

	
}
