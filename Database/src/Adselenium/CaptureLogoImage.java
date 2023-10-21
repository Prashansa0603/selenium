package Adselenium;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage {

	public static void main(String[] args) throws IOException {  
		 System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    WebElement logoImageElement= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	   Screenshot logoImageScreenshot= new AShot().takeScreenshot(driver, logoImageElement);
		ImageIO.write(logoImageScreenshot.getImage(), "png",new File("E:\\Screenshot\\logo\\orangehrm.png"));
		File f=new File("E:\\Screenshot\\logo\\orangehrm.png");
		if(f.exists())
	{
			System.out.println("image file captured");		
	}	
		else
		{
			System.out.println("image file not exist");
		}
	}

}


