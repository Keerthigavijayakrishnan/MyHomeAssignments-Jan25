package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
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
		  //Accounts tab
		  driver.findElement(By.linkText("Accounts")).click();
		  //Create Account button
		  driver.findElement(By.linkText("Create Account")).click();
		  //Account Name
		  driver.findElement(By.id("accountName")).sendKeys("TestLeaf05");
		  //Description
		  driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		  //Industry Drop down
		     WebElement sourceDropdown1 = driver.findElement(By.name("industryEnumId"));
		     Select dd1=new Select(sourceDropdown1);
		     dd1.selectByVisibleText("Computer Software");
		  //Ownership Drop down
		     WebElement sourceDropdown2 = driver.findElement(By.name("ownershipEnumId"));
		     Select dd2=new Select(sourceDropdown2);
		     dd2.selectByVisibleText("S-Corporation");
		  //Source Drop down
		     WebElement sourceDropdown3 = driver.findElement(By.id("dataSourceId"));
		     Select dd3=new Select(sourceDropdown3);
		     dd3.selectByValue("LEAD_EMPLOYEE");
		  //Marketing Campaign Drop down
		     WebElement sourceDropdown4 = driver.findElement(By.id("marketingCampaignId"));
		     Select dd4=new Select(sourceDropdown4);
		     dd4.selectByIndex(6);
		  //State/Province Drop down
		     WebElement sourceDropdown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		     Select dd5=new Select(sourceDropdown5);
		     dd5.selectByValue("TX");
		   //Click the Create Account button
		  driver.findElement(By.className("smallSubmit")).click();
		   //Verify the Account name 
		    WebElement element = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		    System.out.println(element.getText()); 
		     
		  //Close the browser
		  driver.close();
	}

}
