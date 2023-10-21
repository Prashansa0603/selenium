package Adselenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileseg {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/download.html");
	    WebElement downloadlink=driver.findElement(By.linkText("Download Excel"));
	    downloadlink.click();
	    Thread.sleep(4000);
	    File filelocation =new File("C:\\Users\\HP\\Downloads");
	    File[] totalfiles=filelocation.listFiles(); //doubt
	    for(File file:totalfiles) {
	    	if(file.getName().equals(""))
	    	{
	    		System.out.println("file is downloaded");
	    		break;

	    		}
  	
	    }
	}
}
