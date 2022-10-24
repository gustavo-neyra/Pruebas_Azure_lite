package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import cucumber.hooks.Hook;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty"
        ,"json:results/cucumber.json"
        ,"junit:results/cucumber.xml"},
        glue={"steps", "cucumber"}
)


public class Runner extends Hook {

}


