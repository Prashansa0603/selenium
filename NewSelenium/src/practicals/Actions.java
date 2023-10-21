package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Actions {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver dr = new ChromeDriver();
		//dr.get("http://mrbool.com/");
		dr.get("https://demoqa.com/buttons");
		WebElement button=dr.findElement(By.xpath("//button[text()='Right Click Me']"));
				
		
		Actions a= new Actions(dr);
		a.contextClick(button).perform();
	}

}
