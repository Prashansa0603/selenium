package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JetAirways {

	public static void main(String[] args) throws Throwable {
  
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.spicejet.com/");
	  //  driver.manage().window().maximize(); 
	    // radiobutton  round trip or one way
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    // to select the currency value(static dropdown)
	    Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    s.selectByValue("GBP");
	    
	    //displayed on console
	    System.out.println(s.getFirstSelectedOption().getText());
	    Thread.sleep(4000);
	    
	    s.selectByIndex(5);
	    System.out.println(s.getFirstSelectedOption().getText());
	    Thread.sleep(4000);

	    s.selectByVisibleText("INR");
	    System.out.println(s.getFirstSelectedOption().getText());
	    
	    // Passengers dynamic dropdown
	    driver.findElement(By.xpath("//[@id='divpaxinfo']")).click(); 
	    
	    //For Adult 
	    Select s1 = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
	    s1.selectByVisibleText("2");
	    
	    // for child
	    Select s2 = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child")));
	    s2.selectByIndex(2);
	    
	       
	    
	    
	    
	}

}


	