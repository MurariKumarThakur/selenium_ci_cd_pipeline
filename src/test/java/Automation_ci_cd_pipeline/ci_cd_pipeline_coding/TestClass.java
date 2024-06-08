package Automation_ci_cd_pipeline.ci_cd_pipeline_coding;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void launchDriver() {
		
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless");
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get("https://todoapp-f9fc0.web.app/home");
	}
     @Test
    public void test1() {
    	
    	 System.out.println("test 1 title is "+driver.getTitle());
    }
    @Test
    public void test2() {
    	 System.out.println("test 1 title is "+driver.getTitle());
    }
    @Test
    public void test3() {
    	 System.out.println("test 1 title is "+driver.getTitle());
    }
    @AfterMethod
    public void closeBrowserInstance() {
      if(	driver !=null) {
    	  driver.quit(); 
      }
    	
    }
}
