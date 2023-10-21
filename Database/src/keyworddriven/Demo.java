package keyworddriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	  //  Demo.DRead(driver);
	     
	   //  Thread.sleep(5000);
	     driver.close();

	}

	}


