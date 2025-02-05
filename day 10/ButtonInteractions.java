package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteractions {
	public static void main(String[] args) {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://leafground.com/button.xhtml");
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Click on the button with the text 'Click and Confirm title'
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//Verify that the title of the page is 'dashboard'
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		//Navigate from current page to previous page
		driver.navigate().back();
		//Check if the button with the text 'Confirm if the button is disabled' is disabled.
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println("Button enable: "+enabled);
		//Find and print the position of the text 'Submit.'
		WebElement text = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		 Point location = text.getLocation();
	        int x = location.getX();
	        int y = location.getY();
	        System.out.println("Position of the element: X=" + x + ", Y=" + y);
		System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getText());
		//Find and print the background color of the button with the text 'Find the Save button color.'
		String cssValue = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("Background color of the button: "+cssValue);
		System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getText());
		//Find and print the height and width of the button with the text 'Find the height and width of this button.'
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Size of the button: "+size);
		System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getText());
		
		//Close the browser
		driver.close();
		
		
	}

}
