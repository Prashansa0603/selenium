package KeywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Methods {
	static WebDriver driver;
	
	public static void un(WebDriver w)
	{
		w.findElement(By.xpath("//input[@id='login1']")).sendKeys("pranjalikarale22@gmail.com");
	}
	public static void pwd(WebDriver w)
	{
		w.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	}
	// err-border - password
	public static void login(WebDriver w)
	{
		w.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
