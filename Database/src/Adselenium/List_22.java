package Adselenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_22 {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://orchidrepublic.com/blogs/news/types-yellow-flowers-meanings");
		    List<WebElement> ls=driver.findElements(By.tagName("a")); // a is anchor in html
		    int c=ls.size();
		    System.out.println("Total links"+ c);
		    Thread.sleep(4000);
		    for(int i=0;i<c;i++)
		    {
		    	ls=driver.findElements(By.tagName("a"));
		    	System.out.println(ls.get(i).getText());
		    	
		    }
		    
		    driver.close();
	}

}
