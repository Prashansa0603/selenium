package KeywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.mysql.cj.jdbc.Driver;

public class Open_site {

	public static void main(String[] args) throws Throwable {
  
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Read.Dataread(driver);
		Thread.sleep(2000);
		
	}

}
