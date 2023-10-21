package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_horiz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     WebElement wb=driver.findElement(By.linkText("VBScript"));
	     WebElement  wb1=driver.findElement(By.xpath("//a[contains(text(),'SAP MM')]"));
	     js.executeScript("arguments[0].scrollIntoView()", wb);
	     Thread.sleep(5000);
	     js.executeScript("arguments[0].scrollIntoView()", wb1);
	     Thread.sleep(5000);
	     
	     
	     
	}

}
