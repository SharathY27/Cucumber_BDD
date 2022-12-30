package stepDefinitions;

import io.cucumber.java.en.Given;

public class ExpressionDefinition {

	@Given("I have {int} laptop")
	public void I_have_Laptop(Integer count)
	{
		System.out.println("Laptop count is "+count);
	}
	
	@Given("I have {double} GPA")
	public void I_have_GPA(Double gpa)
	{
		System.out.println("Gpa ia "+ gpa);
	}
	
	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String string,String string1,String string2)
	{
		System.out.println(string +  "is elder than "+ string1 + "and "+string2);
	}
}
