package keyworddriven;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Method {
	static WebDriver driver;
		public static void openur1(WebDriver driver)
	{
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
		
	}
	
	public static void un(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")).sendKeys("tharanimudaliar@gamil.com");
		
	}
	
	public static void pwd(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")).sendKeys("Tharani@1995");
		
	}
	public static void login(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[6]/button")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public static void otp(WebDriver driver) throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[7]/button")).click();
		
	}
	
	public static void main(String[] args) {
		
	}
}
		
	