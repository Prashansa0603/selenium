package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
	     
	     driver.get("https://www.spicejet.com/");
	     
	     if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	     {
	    	 Assert.assertTrue(true);
	    	 System.out.println("its enabled");
	     }
	     else
	     {
	    	 Assert.assertTrue(false);
	    	 System.out.println("its not enabled");
	     }
	}

	private static void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}

		}


