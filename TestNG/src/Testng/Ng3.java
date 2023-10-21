package Testng;


import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Ng3 
{
	WebDriver w;
	
  @Test(dataProvider = "dp")
  public void f(String un, String pw) 
  {
	    w.findElement(By.name("userName")).sendKeys(un);;

		w.findElement(By.name("password")).sendKeys(pw);

		w.findElement(By.name("login")).click();
		w.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		w.findElement(By.linkText("SIGN-OFF")).click();

	  
  }

  @DataProvider
  public Object[][] dp() 
  {
		Object[][] data = new Object[3][2];
		
		data[0][0]="test1";
		data[0][1]="test1";
		data[1][0]="ex1";
		data[1][1]="ex1";
		data[2][0]="demo";
		data[2][1]="demo";
	 return data;
  }
  
  
  @BeforeTest
  public void beforeTest() 
  {
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\giris\\Desktop\\SeleniumJars1\\geckodriver.exe"); 
	  System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
		 w=new FirefoxDriver(); 
		 w.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
