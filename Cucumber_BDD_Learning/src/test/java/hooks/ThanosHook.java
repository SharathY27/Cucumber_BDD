package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ThanosHook {

	@Before(order=1)
	public void beforeMethod()
	{
		System.out.println("Thanos collecting on all stones");
	}
	
	@After(order=1)
	public void afterMethod()
	{
		System.out.println("thanos taking rest in the garden");
	}
	
	@Before(order=0)
	public void beforetoBeforeMethod()
	{
		System.out.println("Thanos has to be born");
	}
	
	@After(order=0)
	public void aftertoAfterMethod()
	{
		System.out.println("Finally thanos dies");
	}
	
	@Before("@First")
	public void beforeFirstScenario()
	{
		System.out.println("before First Scenario");
	}
	
	@After("@First")
	public void afterFirstScenario()
	{
		System.out.println("after First Scenario");
	}
	
	@Before("@Second")
	public void beforeSecondScenario()
	{
		System.out.println("before Second Scenario");
	}
	
	@After("@Second")
	public void afterSecondScenario()
	{
		System.out.println("after Second Scenario");
	}
	
	@Before("@Third")
	public void beforeThirdScenario()
	{
		System.out.println("before Third Scenario");
	}
	
	@After("@Third")
	public void afterThirdScenario()
	{
		System.out.println("after Third Scenario");
	}
	
	
}
