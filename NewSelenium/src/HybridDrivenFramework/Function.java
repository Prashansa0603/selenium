package HybridDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Function {
	//hybrid driven=Data  Driven + Keyword Driven
	public static void openurl(WebDriver driver)
	{
		driver.get("http://demo.guru99.com/test/newtours/index.php");	
	}
	public static void username(WebDriver driver, String un)
	{
		driver.findElement(By.name("userName")).sendKeys(un);
	}
	public static void password(WebDriver driver, String pw) 
	{
		driver.findElement(By.name("password")).sendKeys(pw);
		
	}
	public static void login(WebDriver driver)
	{
		driver.findElement(By.name("submit")).click();
	}
	public static void logout(WebDriver driver)
	
	{
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
}
