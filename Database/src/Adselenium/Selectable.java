package Adselenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/download.html");
	    List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\\'selectable\\']/li")); // kiska xpath doubt
	    int listSize=selectable.size();
	    Actions action=new Actions(driver);
	    action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
	    
	    Actions actions = new Actions(driver);
	    actions.clickAndHold(selectable.get(0));
	    actions.clickAndHold(selectable.get(1));
	    actions.clickAndHold(selectable.get(2));
	    actions.clickAndHold(selectable.get(3));
	    actions.build().perform();
	    
	} 

	}


	
	
	