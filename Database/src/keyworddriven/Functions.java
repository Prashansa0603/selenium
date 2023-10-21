package keyworddriven;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Functions {
	
	public static void openUrl(WebDriver w)
	{
	 w.get("http://demo.guru99.com/test/newtours/index.php");// method  body	
	}
	public static void username(WebDriver w, String un)
	{
		w.findElement(By.name("username")).sendKeys(un);
	}
	public static void password(WebDriver w, String pw)
	{
		w.findElement(By.name("password")).sendKeys(pw);
	}
	public static void login(WebDriver w) throws InterruptedException
	{
		w.findElement(By.name("submit")).click();
		Thread.sleep(0);
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	
	public static void logout(WebDriver w)
	{
		w.findElement(By.linkText("SIGN-OFF")).click();
	}
	

	}
