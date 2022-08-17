package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
        (
                features = {"src/test/java"},
                glue = {"StepsDefinition"},
                dryRun = false
        )






public class RunnerGeneralTests extends AbstractTestNGCucumberTests {
}
