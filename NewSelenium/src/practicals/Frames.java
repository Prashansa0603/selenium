package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver w = new ChromeDriver();
	    w.get("https://jqueryui.com/droppable/");
	    w.manage().window().maximize();
	    // To deal with the frames available on webpage & control of script need to be given  
	    // so here, we have to use SwitchTo() method
	    w.switchTo().frame(w.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
	    
	    Actions act = new Actions(w);
	    
	    WebElement src=w.findElement(By.id("draggable"));
	    WebElement dest = w.findElement(By.id("droppable"));
	    act.dragAndDrop(src, dest).build().perform();
	    Thread.sleep(2000);
	    w.close();
	}
	

}
