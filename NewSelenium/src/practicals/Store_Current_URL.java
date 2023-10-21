package practicals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Store_Current_URL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com/");
			String CurrentURL = dr.getCurrentUrl();
			System.out.println(CurrentURL);
	}

}
