package practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	     
	    driver.manage().window().maximize();
	    driver.get("http://echoecho.com/htmlforms10.htm");
	     
	     List <WebElement> bttn = driver.findElements(By.name("group1"));
	     int count=bttn.size();
  	     
	     System.out.println(count);
	     for(int i=0;i<count;i++)
	     {
	    	 System.out.println(bttn.get(i).getAttribute("value"));
	    	 
	     }
	     bttn=driver.findElements(By.name("group2"));
	     int count1=bttn.size();
	     System.out.println(count1);
	     for(int i=0;i<count1;i++)
	     {
	    	System.out.println(bttn.get(i).getAttribute("value"));
	    	
	     }
	      

	}

}
