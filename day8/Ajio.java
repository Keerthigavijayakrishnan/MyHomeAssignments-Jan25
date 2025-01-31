package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the WebDriver
		 ChromeDriver driver = new ChromeDriver();
		 //Load the URL
	     driver.get ("https://www.ajio.com/");
		 //Maximize the browser window
	     driver.manage().window().maximize();    
	     
	     //Find and Enter the element in search box
	     driver.findElement(By.name("searchVal")).sendKeys("bags");
	     //Click on the search
	     driver.findElement(By.className("ic-search")).click();
	     //Select the "Men" in Gender filter
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	     //Select "Fashion Bags" in Category filter
	      Thread.sleep(3000);
	     driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	     //Count of the items
	     String text = driver.findElement(By.className("length")).getText();
	     System.out.println("Number of Products: "+text);
	     //Get the list of brand of the products
	     List<WebElement> brandName = driver.findElements(By.className("brand"));
	     
	     int numberOfBrands = brandName.size();
	     System.out.println("Number of Results: "+numberOfBrands);
	     
	     List<String> allBrand = new ArrayList<String>();
	     System.out.println("Brand of Bags: ");
         for (int i=0; i<numberOfBrands; i++) {
	     String brand = brandName.get(i).getText();
         allBrand.add(brand);
	     System.out.println(brand);
         }
	     //Get the list of names of the bags
	     List<WebElement> listOfNames = driver.findElements(By.className("nameCls")); 
	     
	     List<String> allNames = new ArrayList<String>();
	     System.out.println("Name of Bags: ");
         for (int j=0; j<numberOfBrands; j++) {
	     String names = listOfNames.get(j).getText();
         allNames.add(names);
	     System.out.println(names);
         } 
         
         //Close the browser
         driver.close();
	     
	}

         }
