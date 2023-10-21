package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class priority3 {
  @Test
  public void f() {
	  Assert.assertEquals("Gmail", "Gmail");
}
@Test (priority=1) 
public void f2()
{
  Assert.assertEquals("facebook", "Facebook");

}
  
}
