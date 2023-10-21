package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver w = new ChromeDriver();
	    w.get("http://demo.guru99.com/test/upload/");
	    WebElement uploadElement=w.findElement(By.id("uploadfile_0"));
	    //enter the file path into the file selection input field
	    uploadElement.sendKeys("C:\\Users\\HP LAPTOP\\Documents\\Addition.xlsx");
	    Thread.sleep(3000);
	    //check the "I accept the terms of service" checkbox
	    w.findElement(By.id("terms")).click();
	     
	    // click the "uploadFile" button
	    w.findElement(By.name("send")).click();
	    System.out.println("file uploaded");
	    w.close();
	    
	    
	  
	    

	}

}
