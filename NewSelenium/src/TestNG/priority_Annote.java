package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class priority_Annote {
	WebDriver w;
  @Test 
  public void f() throws Throwable {
	  w.findElement(By.name("userName")).sendKeys("demo");
	  w.findElement(By.name("password")).sendKeys("demo");
	  Thread.sleep(2000);
	  w.findElement(By.name("submit")).click();
	  
  }
  
  @Test
  public void title()
  {
	  if(w.getTitle().contains("login")) // if there is login present/ contains then logout should be done
	  {
		w.findElement(By.linkText("SIGN-OFF")).click();
		System.out.println("Logout done");
	  }
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    
		w=new ChromeDriver();
		w.get("http://demo.guru99.com/test/newtours/index.php");
  }

  @AfterMethod
  public void afterMethod() {
	  w.close();
  }

}
