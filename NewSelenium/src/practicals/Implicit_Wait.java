package practicals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver w = new ChromeDriver();
	    w.get("https://jqueryui.com/droppable/");
	    w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait will ignore the remaining time of the webpage loading 
	    // eg:2sec to load the webpage 8 sec will get ignored from 10 sec
	    // thread will utilize whole 10 sec to load the webpage
	     w.close();

	}

}
