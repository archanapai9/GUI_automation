package persistent.UI_Automation_Wordpress;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class tryTestNG {

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }
  @BeforeClass
  public void beforeclass() {
	  System.out.println("before class");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }
  @BeforeTest
  public void beforetest() {
	  System.out.println("before test");
  }
  @AfterTest
  public void aftertest() {
	  System.out.println("after test");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }
  
  @Test
  public void testMethod() {
	  System.out.println("Test method");
  }
  
  @Test(groups="smoke")
  public void testMethod2() {
	  System.out.println("Test method 2");
  }
  
  @Test(groups="smoke")
  public void testMethod3() {
	  System.out.println("Test method 3");
  }
}
