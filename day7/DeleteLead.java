package week2.day3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the WebDriver
		 ChromeDriver driver = new ChromeDriver();
		 //Load the URL
	     driver.get ("http://leaftaps.com/opentaps/");
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
		 //Leads tabs
		  driver.findElement(By.linkText("Leads")).click();
		  //Click Find Leads
		  driver.findElement(By.linkText("Find Leads")).click();
		  //Click on the Phone tab
		  driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		  //Enter the phone number
		  driver.findElement(By.name("phoneNumber")).sendKeys("1258936988");
		  //Click the Find leads button
          driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		  //Capture the lead ID of the first resulting lead
          Thread.sleep(5000);
          String text = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).getText();
		  //Click the first resulting lead
          Thread.sleep(5000);
          driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		  //Click the Delete button
          driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		  //Click Find leads again
          driver.findElement(By.linkText("Find Leads")).click();
		  //Enter the captured lead ID
          driver.findElement(By.xpath("//label[contains(text(), 'Lead ID:')]/following::input")).sendKeys(text);
		  //Click the Find leads button
          driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		  //Verify the presence of the message "No records to display" in the Lead list. This is the message confirms the successful deletion.
          Thread.sleep(5000);
          boolean isMessageVisible = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
          System.out.println("Is the message visible? " + isMessageVisible);
          
		  //Close the browser
		  driver.close();
		
	}

}
