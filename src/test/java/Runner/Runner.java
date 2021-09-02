package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\megha\\eclipse-workspace\\bddFrame\\cucmberProject\\src\\test\\java\\Feature"
		,glue={"stepDefinition"}
		,dryRun = false
		,monochrome = true
		,format = {"pretty","html:target/Destination"}
		
		)

public class Runner {
		
}