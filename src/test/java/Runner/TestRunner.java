package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature\\ab.feature",glue= {"Stepdef"},plugin= {"html:target/cucumber.html"})

public class TestRunner {

}
