package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class StaticParameterization {
ChromeDriver driver = new ChromeDriver();
@Parameters({"url", "username", "password"})
	
	@BeforeMethod
		public void preCondition(String url, String username, String password) {
	    
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}


}
