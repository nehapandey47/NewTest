package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature\\tagdemo.feature",tags={"@SmokeTest","@FunctionalTest"})
public class Runnerclass {

}
