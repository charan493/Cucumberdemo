package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/html/"},
        features = "F:\\Workspace\\cucumberproject\\src\\test\\resources"
        ,glue={"stepDefinition","F:\\Workspace\\cucumberproject\\src\\test\\java\\base\\BaseClass.java"}
)

public class TestRunner {

}