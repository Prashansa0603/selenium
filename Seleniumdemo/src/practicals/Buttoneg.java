package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttoneg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		     
		     driver.get("http://www.leafground.com/pages/Button.html");
		     
		     //1.go to home
		     WebElement homeButton = driver.findElement(By.id("home"));
		     homeButton.click();
		     
		     //2.get the xy position
		     WebElement getPositionButton=driver.findElement(By.id("position"));
		     Point xypoint=getPositionButton.getLocation();
		     int xValue=xypoint.getX();
		     int yValue=xypoint.getY();
		     System.out.println("X value is:"+xValue+"Y value is :"+yValue);
		     
		    // 3.find the color
		     WebElement colorButton=driver.findElement(By.id("color"));
		     String color=colorButton.getCssValue("background-color");
		     System.out.println("Button color is :"+color);
		     
		     //4.find the size
		     WebElement sizeButton=driver.findElement(By.id("size"));
		     int height= sizeButton.getSize().getHeight();
		    int width=  sizeButton.getSize().getWidth();
		    System.out.println("Height is :"+height+"width is "+ width);
		     

	}

}
