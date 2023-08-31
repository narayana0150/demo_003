package runner_classess;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".src\\test\\resources\\featurefilesrepooo\\userableto_openthe_flipkartwebapplication.feature",
glue = "prac_demo_scripts"
)


public class Runner_for_loginto_homepage {
	

}
