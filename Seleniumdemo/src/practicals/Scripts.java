package practicals;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scripts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//w.get("https://www.facebook.com/");
		//Actions a= new Actions(driver);
        //a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hair conditioners").build().perform();
        //a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).contextClick().build().perform();
		
		Thread.sleep(5000);
		
		//TakesScreenshot srcShot= (TakesScreenshot) driver;
		//File SrcFiles=srcShot
		//FileUtils.copyFile(SrcFile, new File());
		
		
      /*  Alert A = w.switchTo().alert();
        System.out.println(A.getText());
        A.accept();*/
        //driver.navigate().back();
        
        driver.close();

        

	}

}

