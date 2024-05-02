package RunnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\kuvar\\eclipse-workspace\\BDDCucumber\\src\\test\\resources\\FeatureFiles\\Google.feature",glue="stepdef")

public class googleRunner {
	
}