package practicals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiceg {
   
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.com/");
	     
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	   //  System.out.println(driver.getPageSource());
	     
	     Thread.sleep(5000);
	     driver.navigate().back();
	     driver.close();
	}

}
