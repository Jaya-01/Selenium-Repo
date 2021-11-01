package Test_PF;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue={"Stepdef_PF"},
monochrome=true,tags="@smoketest")
public class TestRunner_PF {

}
