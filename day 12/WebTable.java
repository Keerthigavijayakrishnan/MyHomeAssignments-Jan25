package week3.day4;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		    //Initialize ChromeDriver 
		    ChromeDriver driver=new ChromeDriver();
		    //Load the URL
			driver.get("https://erail.in/");
			// Maximize the browser window
			driver.manage().window().maximize();
			//Implicit wait to ensure the web page elements are fully loaded
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			// Enter "MAS" as the "From" station.
			driver.findElement(By.id("txtStationFrom")).click();
			driver.findElement(By.id("txtStationFrom")).clear();
			driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//strong[text()='MAS']")).click();
			// Enter "MDU" as the "To" station.
			driver.findElement(By.id("txtStationTo")).click();
			driver.findElement(By.id("txtStationTo")).clear();
			driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
			driver.findElement(By.xpath("//strong[text()='MDU']")).click();
			// Uncheck the "Sort on Date" checkbox. 
			driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
			// Retrieve the train names from the web table. 
			List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
			
			System.out.println("Duplicate Train Names: ");       
			for (int i=0; i<trainNames.size(); i++) {  
			String text1 = trainNames.get(i).getText(); 
						
			// Verify if there are any duplicate train names in the web table
			for (int j=i+1; j<trainNames.size(); j++) { 
				String text2 = trainNames.get(j).getText();
				if (text2.equals(text1)) {
					System.out.println(text2);
					//break;                                            // To avoid printing duplicates multiple times
				}				
			}
		}	
			//Close the browser
			driver.close();
			
	}

}
