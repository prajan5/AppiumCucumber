package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"}, glue = {"stepDef"}, publish = true)
//@CucumberOptions is not needed if features and steps definitions file is in the same package (TestRunner package)
//publish = true for report
public class TestRunner extends AbstractTestNGCucumberTests {
}
