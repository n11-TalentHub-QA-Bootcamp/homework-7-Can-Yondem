package testrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//glue="steps"
@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features",glue="steps")
public class TestRunner_GoogleHomePage {

}
