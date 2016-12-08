import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"/Users/bittech/Documents/workspace/BTC005BddClass/EndToEnd.feature"},tags={"@s2"},format={"pretty", "json:target/cucumber1"},plugin={"html:target/cucumber2"})
public class Runner 
{


}
