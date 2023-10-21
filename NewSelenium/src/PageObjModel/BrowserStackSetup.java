package PageObjModel;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import PageObject.BrowserStackHomePage;
import PageObject.BrowserStackSignUpPage;

public class BrowserStackSetup {
	String driverPath = "E:\\Selenium Practical\\chromedriver.exe";
	WebDriver driver;
	BrowserStackHomePage objBrowserStackHomePage;
	BrowserStackSignUpPage objBrowserStackSignUpPage;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	   
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/");
	}
}
