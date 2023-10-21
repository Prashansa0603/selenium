package Testng;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Ng4 {
  @Test
  public void f()
  {
	  System.out.println("I m in Test");
  } 
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("I m in beforemethod");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("I m in aftermethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("I m in Beforeclass"); 
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("I m in Afterclass");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("I m in Beforetest");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("I m in Aftertest");
  }

  
}
