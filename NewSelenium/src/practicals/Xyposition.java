package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xyposition {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver w = new ChromeDriver();
	    w.get("http://demo.guru99.com/test/drag_drop.html");
	    
	    WebElement element= w.findElement(By.xpath("//a[contains(text(),'BANK')]"));
	    
	    Point pt=element.getLocation();
	    System.out.println("position of webelement from left side:"+pt.getX()+"pixels");
	    System.out.println("position of webelement from right side:"+pt.getY()+"pixels");
	    
        WebElement element1= w.findElement(By.xpath("//a[contains(text(),\"OWNER'S EQUITY\")]"));
	    
	    Point pt1=element1.getLocation();
	    System.out.println("position of webelement from left side:"+pt1.getX()+"pixels");
	    System.out.println("position of webelement from right side:"+pt1.getY()+"pixels");
	    
	    Thread.sleep(3000);
	    w.close();
	    
	    
	}

}
