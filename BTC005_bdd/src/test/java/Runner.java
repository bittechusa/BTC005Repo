import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//With tags we can mention which test to run
@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/bittech/Documents/workspace/BTC005_bdd/login.feature",tags={"@Login,@Signup"}, format = {"pretty", "jason:target/Destination"} )

public class Runner {
	
}
