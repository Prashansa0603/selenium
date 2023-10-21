package Adselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/drop.html");
	    WebElement From=driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.clickAndHold(From).moveToElement(To).release().build().perform(); //1st method
	//	act.dragAndDrop(From, To).build().perform(); // 2nd method
		
	}
}
