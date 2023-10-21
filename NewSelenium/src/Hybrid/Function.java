package Hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Function {
	public static void openurl(WebDriver dr)
	{
		dr.get("http://demo.guru99.com/test/newtours/index.php");
	}
	public static void username(WebDriver dr,String un)
	{
		dr.findElement(By.name("userName")).sendKeys(un);
	}
	
	public static void password(WebDriver dr,String pw) throws Throwable
	{
		dr.findElement(By.name("password")).sendKeys(pw);
		Thread.sleep(2000);
	}
	
	public static void login(WebDriver dr)
	{
		dr.findElement(By.name("submit")).click();
	}
	public static void logout(WebDriver dr)
	{
		dr.findElement(By.linkText("SIGN-OFF")).click();
	}

}
