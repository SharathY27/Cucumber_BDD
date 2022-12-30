package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithoutHeaderDefinition {
	
	WebDriver driver;
	
	@Given("the user is on login page")
	public void the_user_is_on_login_page() throws InterruptedException {
	 
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("the user is entering below credentials")
	public void the_user_is_entering_below_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		 List<String> list =  dataTable.transpose().asList(String.class);
		 String username = list.get(0);
		 String pwd = list.get(1);
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	   
	}

	@When("the user click on login button")
	public void the_user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[text()[normalize-space()='Login']]")).click();
	}
	
	  @Then("the user is navigated to home page")
	  public void the_user_is_navigated_to_home_page() { // Write code here that turns the
		  driver.quit();
	  
	  }
	 


}
