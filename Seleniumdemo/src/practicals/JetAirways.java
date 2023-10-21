package practicals;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class JetAirways {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://www.spicejet.com/");
		    
			   //  driver.navigate().back();
			 driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
			 Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			 s.selectByVisibleText("INR");
			 System.out.println(s.getFirstSelectedOption().getText());
			 Thread.sleep(3000);
			 s.selectByIndex(5);
			 System.out.println(s.getFirstSelectedOption().getText());
			 Thread.sleep(3000);
			 s.selectByVisibleText("GBP");
			 System.out.println(s.getFirstSelectedOption().getText());
			 
			 // updated dropdowns no of passengers
			 driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();			 
			 Select s1 = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
			 s1.selectByVisibleText("3");
			 
			 Select s2 = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child"))); 
			 s2.selectByIndex(2);
			 
			 Select s3 = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Infant"))); 
			 s3.selectByValue("1");
			 driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
			// driver.findElement(By.xpath("")).click(); 						// doubt find xpath
			
			 System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
			 
			 // validation  of property of enabled & disabled
			 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			 {
				 Assert.assertTrue(true);
				 System.out.println("its enabled");
			 }
			 else
			 {
				 Assert.assertTrue(true);
				 System.out.println("its not enabled");
			 }
			 
			 Thread.sleep(5000);
			// driver.findElement(By.xpath("")).click(); // doubt
			 
			 //driver.findElement(By.xpath("")).click();
			 //Thread.sleep(2000);
			 //driver.findElement(By.xpath("")).click();
		}
}












