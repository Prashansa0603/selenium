package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
 

public class Action2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	     
	    WebElement un= driver.findElement(By.name("email"));
	    WebElement pwd= driver.findElement(By.name("password"));
	    //WebElement fg=driver.findElement(By.name("forget password"));
	    
	    Actions a = new Actions(driver);
	    a.moveToElement(un).click().keyDown(un, Keys.SHIFT).sendKeys(un, "demo").build().perform();	    
	    Thread.sleep(5000);
	    a.moveToElement(pwd).click().keyDown(pwd, Keys.SHIFT).sendKeys("ttl").keyUp(pwd, Keys.SHIFT).contextClick().build().perform();
	    Thread.sleep(8000);
	  //a.moveToElement(fg).click().keyDown(fg, Keys.SHIFT).sendKeys("").keyUp(fg, Keys.SHIFT).contextClick().build().perform();
	   // driver.close();
	    
	}

}
