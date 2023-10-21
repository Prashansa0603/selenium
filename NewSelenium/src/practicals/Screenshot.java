
package practicals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver w = new ChromeDriver();
	    w.get("https://orchidrepublic.com/blogs/news/types-yellow-flowers-meanings");
	    
	    //scroll vertically
	    JavascriptExecutor js=(JavascriptExecutor) w;
	    js.executeScript("window.scrollBy(0,1300)");
	    
	    w.manage().window().maximize();
	    // convert webdriver object to takesscreenshot
	    TakesScreenshot srcshot=(TakesScreenshot)w;
	    File Srcfile=srcshot.getScreenshotAs(OutputType.FILE);
	    
	    FileUtils.copyFile(Srcfile,new File("E:\\Screenshot\\new10.png"));
	    
	    Thread.sleep(2000);
	    w.close();
	    
	    

	}

}
