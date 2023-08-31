package prac_demo_scripts;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMO_01 {
	
	
	
	public void xyzz() throws Throwable {
		WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.switchTo().alert().accept();
	  Robot r=new Robot();
	  driver.findElement(null);
	  Select se=new Select(null);
	}

}