package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//Background steps will run before scenario and its only preconditions happening before scenarios
//Hooks has more priority than background if hooks and background are used together then 
//hooks will run first(i.e @Before) and the background and scenarios 

public class BackgroundDefinition {
	
	@Before
	public void beforeMethod()
	{
		System.out.println("Before all methods");
	}
	
	@After
	public void afterMethod()
	{
		System.out.println("After all methods");
	}
	
	@Given("the student finished high school")
	public void the_student_finished_high_school() {
	
	   System.out.println("the student finished high school");
	}

	@Given("the student finished higher secondary school")
	public void the_student_finished_higher_secondary_school() {
	
	   System.out.println("the student finished higher secondary school");
	}

	@Given("the student applies for medical course")
	public void the_student_applies_for_medical_course() {
	
	   System.out.println("the student applies for medical course");
	}

	@When("student cleared entrance exam")
	public void student_cleared_entrance_exam() {
	
	   System.out.println("student cleared entrance exam");
	}

	@Then("the student is eligible for joining any medical college")
	public void the_student_is_eligible_for_joining_any_medical_college() {
	
	   System.out.println("the student is eligible for joining any medical college");
	}

	@Given("the student applies for engineering course")
	public void the_student_applies_for_engineering_course() {
	
	   System.out.println("the student applies for engineering course");
	}

	@When("student has a sayable cutoff")
	public void student_has_a_sayable_cutoff() {
	
	   System.out.println("student has a sayable cutoff");
	}

	@Then("student is eligible for engineering course")
	public void student_is_eligible_for_engineering_course() {
	
	   System.out.println("student has a sayable cutoff");
	}

}
