package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealActions {
	public static void main(String[] args) throws IOException, InterruptedException {
		 //Initialize ChromeDriver 
	    ChromeDriver driver=new ChromeDriver();
	    //Load the URL
		driver.get("https://www.snapdeal.com/");
		// Maximize the browser window
		driver.manage().window().maximize();
		//Implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Go to "Men's Fashion". 
		    //Instantiate the Actions class
		Actions actMouseHover1 = new Actions(driver);
		    //Find the element
		WebElement hoverElement1 = driver.findElement(By.xpath("//span[contains(text(),'Men')][1]"));
		    //Mouse Hovering - moveToElement
		actMouseHover1.moveToElement(hoverElement1).perform();
		
		// Go to "Sports Shoes". 
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		// Get the count of sports shoes. 
		String countOfShoes = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Count of Sports Shoes: "+countOfShoes);
		// Click on "Training Shoes". 
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		// Sort the products by "Low to High".
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
		// Check if the displayed items are sorted correctly. 
		Thread.sleep(3000);
		List<WebElement> sort = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		System.out.println("Sorted order of Price: ");
		for (int i=0; i<sort.size(); i++) {
			System.out.println(sort.get(i).getText());
		}
		// Select any price range ex:(500-700).
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("500");
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("700");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		// Filter by any colour. 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[1]")).click();
		// Verify all the applied filters.
		String priceFrom = driver.findElement(By.className("from-price-text")).getText();
		System.out.println("Filtered Price Starts: "+priceFrom);
		String priceTo = driver.findElement(By.className("to-price-text")).getText();
		System.out.println("Filtered Price Ends: "+priceTo);
		String colorFilter = driver.findElement(By.xpath("(//div[@class='filter-content '])[1]//a")).getText();
		System.out.println("Filtered Color: "+colorFilter);
				
		// Mouse hover on the first resulting "Training Shoes". 
		Actions actMouseHover2 = new Actions(driver);
		WebElement hoverElement2 = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
		actMouseHover2.moveToElement(hoverElement2).perform();
		
		// Click the "Quick View" button. 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]/div")).click();
		// Print the cost and the discount percentage.
		Thread.sleep(3000);
		String CandD = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
		System.out.println("Cost and the discount percentage: "+CandD);
		
		// Take a snapshot of the shoes. 
		WebElement screenShot = driver.findElement(By.xpath("(//ul[@id='bx-slider-qv-image-panel']/li)[1]"));
		      //Take the screenshot
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		      //Setup the patch for the file
		File destination = new File ("./Screenshot/ShoeInSnapdeal.png");
		      //Save the screenshot in the folde
		FileUtils.copyFile(source, destination);
		           
		// Close the window.
		driver.close();
		
		
	}

}
