package Automation_ci_cd_pipeline.ci_cd_pipeline_coding;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void launchDriver() {
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
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
    	driver.quit();
    }
}
