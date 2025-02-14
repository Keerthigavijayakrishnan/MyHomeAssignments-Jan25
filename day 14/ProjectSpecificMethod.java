package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeMethod
		public void preCondition() {
	
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Test@2025");
		driver.findElement(By.id("Login")).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
