package Adselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// initiate driver
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicit wait for 10 seconds
	    //open URL of app
	    driver.get("http://newtours.demoaut.com/");
	    Thread.sleep(5000);
	    // capture links from a webpage
	    List <WebElement> links = driver.findElements(By.tagName("a"));
	    // number of links
	    System.out.println(links.size());
	    
	    for(int i=0; i<links.size(); i++)
	    {    // by using href attribute we can get url of required link
	    	WebElement element =links.get(i);
	    	String url= element.getAttribute("href");
	    	
	    	URL link = new URL(url);
	    	// create a connection using url object 'link'
	     	HttpURLConnection httpConn =(HttpURLConnection) link.openConnection();
	     	// wait 2 seconds
	    	Thread.sleep(2000);
	    	// establish the connection
	     	httpConn.connect();
	     	int rescode =httpConn.getResponseCode(); // return response if response code is above 400: broken link
	     	if(rescode>=400)
	     	{
	     		System.out.println(url + " - "  + " is broken link");
	     	}
	     	else
	     	{
	     		System.out.println(url + " - "  + "  is valid link");	
	     	}
	     	   			
	    
	    }
	   	
	}

}
