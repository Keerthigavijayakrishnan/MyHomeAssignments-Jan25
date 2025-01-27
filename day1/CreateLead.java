package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
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
	 //Lead tabs
	  driver.findElement(By.linkText("Leads")).click();
	  //Create Lead button
	  driver.findElement(By.linkText("Create Lead")).click();
	 //Enter a First Name
	  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
	  //Enter a Last Name
	  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
	  //Enter a Company Name
	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaf Taps");
	  //Enter a Title
	  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");
	  //Click the Create Lead button
	  driver.findElement(By.className("smallSubmit")).click();
	  //Verify the Title
	  System.out.println(driver.getTitle());
	  
	  //Close the browser
	  driver.quit();

}
}
