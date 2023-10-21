package practicals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://orchidrepublic.com/blogs/news/types-yellow-flowers-meanings");
		    JavascriptExecutor js=(JavascriptExecutor)driver; // casting 
//In Selenium Webdriver, locators like XPath, CSS, etc. are used to identify and perform operations on a web page.
//In case, these locators do not work you can use JavaScriptExecutor. You can use JavaScriptExecutor to perform an desired operation on a web element.
//Selenium supports javaScriptExecutor. There is no need for an extra plugin or add-on. You just need to import (org.openqa.selenium.JavascriptExecutor) in the script as to use JavaScriptExecutor.
		     
		     js.executeScript("window.scrollBy(0,500)");
		     Thread.sleep(5000);
		     TakesScreenshot src=(TakesScreenshot)driver;
		     File srcFile= src.getScreenshotAs(OutputType.FILE);
		     Files.copy(srcFile, new File("E:\\Screenshot\\ss.png"));
		     driver.quit();
		     
		     
	}

}
