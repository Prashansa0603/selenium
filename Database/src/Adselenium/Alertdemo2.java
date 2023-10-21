package Adselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");
	    driver.findElement(By.name("cusid")).sendKeys("553920");
	    driver.findElement(By.name("submit")).submit();
	    Alert alert = driver.switchTo().alert();
	    String alertMessage = alert.getText();
	    System.out.println(alertMessage);
	    Thread.sleep(2000);
	    alert.dismiss();
	    driver.close();
}

}
