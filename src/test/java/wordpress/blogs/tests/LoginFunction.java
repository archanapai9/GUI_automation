package wordpress.blogs.tests;

import main.source.page.classes.LoginPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginFunction {
  
  WebDriver driver;
  LoginPage login = new LoginPage(driver);
  
  @Test
  public void verify_Successful_Login() {
	  login.loginValid("uname", "pass");
  }
  
  @Test
  public void verify_Invalid_Login() {
	  login.loginInvalid("uname", "pass");
  }
}
