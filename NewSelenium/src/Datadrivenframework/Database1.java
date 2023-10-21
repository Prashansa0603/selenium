package Datadrivenframework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Database1 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Credentials","root","123456789");
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from login_11");
		
		while(rs.next()==true)
		{
			String us=rs.getString("username");
			String pw=rs.getString("password");
			
			System.out.println(us+"    "+pw);
			
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/newtours/index.php");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("userName")).sendKeys(us);
	    driver.findElement(By.name("password")).sendKeys(pw);
	    driver.findElement(By.name("submit")).click();
	    
	    driver.findElement(By.linkText("SIGN-OFF")).click();
	    System.out.println("login done");
	    driver.close();
	
	}
	
}
}
