package Adselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdemo {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		    driver.manage().window().maximize();
		  //  Select op= new Select(driver.findElement(By.id("select-demo")));
		   
		   // op.selectByIndex(4);
		  // op.selectByVisibleText("Tuesday");
		   // op.selectByValue("Wednesday");
		   // For scroll the page
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,500)"); 
		   Select opt= new Select(driver.findElement(By.id("multi-select")));
		   opt.selectByVisibleText("Texas");
		   WebElement n = driver.findElement(By.id("printMe"));
		   n.click();
		    Thread.sleep(2000);
		    driver.close();
		    

	}

}
