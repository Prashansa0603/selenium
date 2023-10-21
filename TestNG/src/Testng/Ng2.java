package Testng;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Ng2
{
	WebDriver w;
  @Test
  public void f() 
  {
	  w.findElement(By.name("userName")).sendKeys("demo");;
	  
	  w.findElement(By.name("password")).sendKeys("demo");
	  
	  w.findElement(By.name("login")).click();
	  w.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  w.findElement(By.linkText("SIGN-OFF")).click();


  }
  @BeforeTest
  public void beforeTest()
  {
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\giris\\Desktop\\SeleniumJars1\\geckodriver.exe"); 
	   w=new FirefoxDriver();
	  w.get("http://newtours.demoaut.com/");


  }

  @AfterTest
  public void afterTest() 
  {
	 w.close();
	 
  }

}
