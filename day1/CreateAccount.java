package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
public static void main(String[] args) {
		
		//Initialize the WebDriver
	 ChromeDriver driver = new ChromeDriver();
	 //Load the URL
     driver.get ("http://leaftaps.com/opentaps/control/main");
	 //Maximize the browser window
     driver.manage().window().maximize();
	  
	  //User name
	  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	  //Password
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
	  //Login Button	  
	  driver.findElement(By.className("decorativeSubmit")).click();
	  //CRM/SFA link
	  driver.findElement(By.linkText("CRM/SFA")).click(); 
	  //Accounts tab
	  driver.findElement(By.linkText("Accounts")).click();
	  //Create Account button
	  driver.findElement(By.linkText("Create Account")).click();
	  //Account Name
	  driver.findElement(By.id("accountName")).sendKeys("TestLeaf");
	  //Description
	  driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	  //Number Of Employees
	  driver.findElement(By.id("numberEmployees")).sendKeys("25");
	  //Site Name
	  driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	  //Click the Create Account button
	  driver.findElement(By.className("smallSubmit")).click();
	  //Verify the Title
	  System.out.println(driver.getTitle());
	  
	  //Close the browser
	  driver.quit();

}
}
