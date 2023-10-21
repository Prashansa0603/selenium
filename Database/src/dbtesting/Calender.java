package dbtesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args)  {  
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
	
	WebElement 	calendar=driver.findElement(By.id("datepicker"));
	//calendar.sendKeys("02/10/2019"+Keys.ENTER);
	
	calendar.click();
	
	
	WebElement nextButton=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
	
	nextButton.click();
	
	WebElement dataToBeGiven=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a"));
	
	dataToBeGiven.click();
	
	
}

}

