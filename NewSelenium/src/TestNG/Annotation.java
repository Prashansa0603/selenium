package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotation {
  @Test
  public void f() {
	  System.out.println(" i am in test method ");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" i am in before method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in  after method ");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" i am in before class ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" i am in after class ");
  }
 
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println(" i am in before test ");
  }
@AfterTest
public void afterTest()
{
	 System.out.println(" i am in after test ");	
}
  
}
