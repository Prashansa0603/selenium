    package practicals;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_1 {

	
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://orchidrepublic.com/blogs/news/types-yellow-flowers-meanings");
		List<WebElement> ls= driver.findElements(By.tagName("a"));
		int sz=ls.size();
		Thread.sleep(50000);
		System.out.println("Total links are "+sz);
		
		for(int i=0; i<sz;i++) 
		{
			ls=driver.findElements(By.tagName("a"));
			System.out.println(ls.get(i).getText());
		}
}
}