package persistent.UI_Automation_Wordpress;

import java.util.concurrent.TimeUnit;

import main.source.page.classes.DashboardPage;
import main.source.page.classes.LoginPage;
import main.source.page.classes.PostPage;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreatePostDriver {
  
  WebDriver driver;
  LoginPage login;
  DashboardPage dash;
  PostPage createPost;
  
  private static Logger log = Logger.getLogger(CreatePostDriver.class);
  
  @Test
  public void CreatePost() {
	  driver = new FirefoxDriver();
	  
	  DOMConfigurator.configure("log4j.xml");
	  
	  driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	  log.info("Fetched url...");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  log.info("Get a LoginPage object");
	  login = PageFactory.initElements(driver, LoginPage.class);;
	  
	  dash = login.loginValid("archanapai9", "r@ghu321");
	  
	  createPost=dash.navigate();
	  
	  createPost.addNewPost();
	  
	  driver.quit();
	  
  }
}
