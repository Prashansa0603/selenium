package practicals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver dr = new ChromeDriver();
		dr.get("https://www.tutorialspoint.com/about/about_careers.htm");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//getTitle() to obtain page Title
		System.out.println("Page Title is: "+ dr.getTitle());
	}

}
 