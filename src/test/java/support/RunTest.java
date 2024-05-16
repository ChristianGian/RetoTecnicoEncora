package support;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features",
    glue = "definitions",

    tags = "@createUser",

    plugin = {"json:target/cucumber-report/cucumber.json"})

public class RunTest {
}
