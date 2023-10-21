package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		String text="testing";
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.id("name")).sendKeys(text);
	    driver.findElement(By.id("alertbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();
	    driver.navigate().back();
	    driver.close();
	
	}

}
