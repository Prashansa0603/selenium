package Adselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/Window.html");
	    WebElement window=driver.findElement(By.id("home"));
	    window.click();
	     
	     
	}


	}


