package TestNG;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class Data_Provider {
	WebDriver w;
	
  @Test(dataProvider = "dp")
  public void f(String un, String pw) {
	  w.findElement(By.name("userName")).sendKeys(un);
	  w.findElement(By.name("password")).sendKeys(pw);
	  w.findElement(By.name("submit")).click();
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    Object [][] data=new Object [2][2];
    
    data[0][0]="test1";
    data[0][1]="test1";
    data[1][0]="exe1";
    data[0][1]="exe1";
    return data;
  }
  @BeforeTest
  public void beforeTest() throws Throwable {
	 
	  System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    
		w=new ChromeDriver();
		w.get("http://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
