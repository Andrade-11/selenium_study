package saucedemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/saucedemo/resources/features"},glue = {"saucedemo/steps"})

public class TestRunner {

}
