package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChildStaticParameterization extends StaticParameterization {
	@Test
	public void testCase() throws InterruptedException {

		//Click on the toggle menu button from the left corner 
		driver.findElement(By.xpath("//button/div[@class='slds-icon-waffle']")).click();
		Thread.sleep(5000);
		//Click View All and click Legal Entities from App Launcher 
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Click on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("legal Entities");
		driver.findElement(By.xpath("//mark[contains(text(),'Legal ')]")).click();
		//Click on New Legal Entity 
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//Enter the Company name as 'TestLeaf'. 
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		//Enter Description as 'Salesforces'.  
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		//Select Status as 'Active' 
		WebElement statusDropdown = driver.findElement(By.xpath("//div[@class='slds-combobox_container']//button"));
		         //use javascript executor
		driver.executeScript("arguments[0].click();", statusDropdown);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		
		//Click on Save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//Verify the Alert message (Complete this field) displayed for Name 
		//String text1 = driver.findElement(By.xpath("//div[@class='container']")).getText();
		//System.out.println("Alert Message: "+text1);
		String text2 = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]")).getText();
		System.out.println("Alert Message for Name: "+text2);
		//close the error window 
		driver.findElement(By.xpath("//button[@title='Close error dialog']")).click();
		//close the current window
		driver.findElement(By.xpath("//button[@title='Cancel and close']")).click();
		
	}

}
