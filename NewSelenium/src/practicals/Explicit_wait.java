package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver w = new ChromeDriver();
	   
	    w.manage().window().maximize();
	    w.get("http://demo.guru99.com/test/drag_drop.html");
	    WebElement from=w.findElement(By.xpath("//a[contains(text(),'BANK')]"));
	   // WebElement from1 =w.findElement(By.xpath("//*[@id=\'credit1\']/a"));
	    //Explicit wait
	    WebDriverWait wait=new WebDriverWait(w,10);
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]")));
	    WebElement to=w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
	   WebElement t1=w.findElement(By.xpath("//*[@id=\"table4\"]/tbody/tr/td[1]"));
	    Actions a = new Actions(w);
	  // a.dragAndDrop(from1, t1).perform();
	    a.dragAndDrop(from, to).perform();
	   // w.close();
	    System.out.println("Dropped!!");
	    
	    
	    
	    

	}

}
