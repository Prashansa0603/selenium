package practicals;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Mouse {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.browserstack.com/");

	Actions a = new Actions(driver);


	//Double click on element

	WebElement act = driver.findElement(By.xpath("/html/body"));
	WebElement act1 = driver.findElement(By.xpath("//*[@id=\"home-page\"]"));

	//a.doubleClick(act);
	a.click(act1);
	}

}