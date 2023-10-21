package Testng;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void login() 
  {
	  System.out.println("I m in test");
  }
  
  @Test
  public void logout() 
  {
	  System.out.println("I m in test out");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  
  }

  @AfterSuite
  public void afterSuite() 
  {
	  
  }

}

/*
@Test
public void login() 
{
	  System.out.println("I m in test");
}


@BeforeMethod
public void beforeMethod() 
{
	  
}

@AfterMethod
public void afterMethod() 
{
	  
}

@BeforeClass
public void beforeClass() 
{
	  
}

@AfterClass
public void afterClass() {
}

@BeforeTest
public void beforeTest() {
}

@AfterTest
public void afterTest() {
}

@BeforeSuite
public void beforeSuite() 
{
	  
}

@AfterSuite
public void afterSuite() 
{
	  
}

}
 */
