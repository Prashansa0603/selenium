package Adselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	   
	    WebElement src= driver.findElement(By.id("box6"));
	    WebElement dest= driver.findElement(By.id("box106"));
	    WebElement src1= driver.findElement(By.id("box3"));
	    WebElement dest1= driver.findElement(By.id("box103"));
	    
	    Actions act=new Actions(driver);
	    Actions act1=new Actions(driver);
	    act.dragAndDrop(src, dest).perform();
	    act1.dragAndDrop(src1, dest1).perform();
	    
	    //driver.close();
	}

}
