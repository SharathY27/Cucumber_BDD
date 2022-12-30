package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
//features="src/test/resources/FeatureFiles/Login.feature", 
features="src/test/resources/FeatureFiles", 
//glue = { "stepDefinitions" , "hooks"},
glue = { "stepDefinitions"},
tags = "not @Login",
plugin = {"pretty","html:target/HtmlReports/htmlreport.html" ,
				   "json:target/JsonReports/jsonreport.json" ,
				   "junit:target/JunitReports/junitreport.xml" 
				   },
monochrome = false

)
public class RunnerClass {

	//it should combine feature file and step definition class

}
