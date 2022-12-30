package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithHeaderDefinition {
	
	
	WebDriver driver;
	@Given("Now the user is on login page")
	public void now_the_user_is_on_login_page() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("now the user is entering below credentials")
	public void now_the_user_is_entering_below_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		
		//one method
		/*
		 * List<Map<String,String>> credentials =
		 * dataTable.asMaps(String.class,String.class);
		 * 
		 * System.out.println(credentials); String username =
		 * credentials.get(0).get("Username"); String pwd =
		 * credentials.get(0).get("Password");
		 */
		 
		 
		 //second method
		 
		 List<List<String>> values = dataTable.asLists();
		 
		 String username = values.get(1).get(0);
		 String pwd = values.get(1).get(1);
		 
		 System.out.println(values);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		
		
	}

	@When("now the user click on login button")
	public void now_the_user_click_on_login_button() {
		driver.findElement(By.xpath("//button[text()[normalize-space()='Login']]")).click();
	}

	@Then("now the user is navigated to home page")
	public void now_the_user_is_navigated_to_home_page() {
		  driver.quit();
	}

}
