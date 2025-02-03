package week3.day1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertInteractions {
	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://leafground.com/alert.xhtml");
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Click on the "Prompt Box" button to trigger the alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//Switch to the alert 
		Alert promptAlert = driver.switchTo().alert();		
		//Message in the alert box 
		String message = "Selection Text";
		promptAlert.sendKeys(message);
		//Retrieve the typed text from the alert 
		String alertText = promptAlert.getText();                              //Method2 - To verify the text
	    System.out.println("Text in Prompt Alert Box: "+alertText);
		//System.out.println(promptAlert.getText());                           //Method1 - To Retrieve the text directly
		   
		//Dismiss the alert
	     promptAlert.dismiss();                                                 //For dismiss - text not entered
		//promptAlert.accept();                                                  //For accept - text entered
		//Retrieve the typed text from the alert
		String value = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(value);
	    //Verify the text using conditional statements 	
		if (value.contains(message))	{
			System.out.println("Text Entered in the Alert");
		}else {						
			System.out.println("Text not Entered");
		} 
	
		
	}
}
