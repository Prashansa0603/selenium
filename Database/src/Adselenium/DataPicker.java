package Adselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {

	public static void main(String[] args) {
		String month="March 2019";
		String day="20";
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.phptravels.net/");
	    
				
		

	}

}
