package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/draggable/");
	    driver.switchTo().frame(driver.findElement(By.xpath("")));// doubt
	    driver.findElement(By.xpath("")).click();
	     
	    Actions a = new Actions(driver); // object with parameter.
	    WebElement src= driver.findElement(By.id("draggable"));
	    Thread.sleep(5000);
	    WebElement dst= driver.findElement(By.id("droppable"));
	    a.dragAndDrop(src, dst).build().perform();
	    Thread.sleep(5000);
	}

}
