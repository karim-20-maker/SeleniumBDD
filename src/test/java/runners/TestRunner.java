package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/features/SubscriptionPackages.feature"},
        glue  = {"hooks","pages","stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@Test"
       )
public class TestRunner {

    @BeforeClass
    public static void setup() {


    }
}
