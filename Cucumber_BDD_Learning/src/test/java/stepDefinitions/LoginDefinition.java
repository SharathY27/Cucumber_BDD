package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDefinition {
	
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@When("user is entering login credentials")
	public void user_is_entering_login_credentials() {
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[text()[normalize-space()='Login']]")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	   System.out.println("Success");
	}

}
