package dbtesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Jdbcconnection {

	public static void main(String[] args) throws  ClassNotFoundException, SQLException, InterruptedException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String host="localhost";
	String port="3306";
	Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/employee","root", "123456789");
	Statement s=conn.createStatement();
	ResultSet rs=s.executeQuery("select * from credentials where scenario=' '");
	{
		System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Practical\\chromedriver.exe");
	     
	     WebDriver driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.login.salesforce.com/");
	     driver.findElement(By.id("username")).sendKeys(rs.getString("Usernname"));
	     Thread.sleep(5000);
	     driver.findElement(By.id("pw")).sendKeys(rs.getString("Password"));
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@value='Login']")).click();
			Thread.sleep(5000);
			driver.navigate().back();
			driver.close();
	}

}
}
