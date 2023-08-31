package prac_demo_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class User_able_to_homepage_flipkart {
	
	WebDriver driver;
	@Given("openbroeser and enter aid url")
	public void openbroeser_and_enter_aid_url() {
		WebDriverManager.chromedriver().setup();
              driver=new ChromeDriver();
              driver.navigate().to("https://www.flipkart.com");
	   
	}
	@When("oooooo")
	public void methodd() {
		System.out.println("it is amethod");
	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
	   
	}


}
