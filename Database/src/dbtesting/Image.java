package dbtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Image {

			public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			     
			     driver.manage().window().maximize();
			     
			     driver.get("http://www.leafground.com/pages/Image.html");
			     
			    /* WebElement firstImage=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
			     
			     firstImage.click();*/
			     
			     WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
			     
			     if(brokenImage.getAttribute("naturalWidth").equals("0")) {
			    	 System.out.println("The image is broken");
			     }
			     else
			     {
			    	 System.out.println("The image is NOT broken");
			    	 
			     }
			     
			}

}
