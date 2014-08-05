package main.source.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//vars Webdriver element, username, password
	WebDriver driver;
	
	@FindBy(id="user_login")
	private WebElement inpUserLogin;
	
	@FindBy(id="user_pass")
	private WebElement inpUserPass;
	
	@FindBy(id="wp-submit")
	private WebElement btnSubmit;
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		
	}
	public DashboardPage loginValid(String uname, String pass) {
		System.out.println("Username:"+uname+" Pass: "+ pass);
		
		//driver.findElement(By.id("user_login")).sendKeys(uname);
		//driver.findElement(By.id("user_pass")).sendKeys(pass);
		//driver.findElement(By.id("wp-submit")).click();
		inpUserLogin.sendKeys(uname);
		inpUserPass.sendKeys(pass);
		btnSubmit.click();
		
		//return new DashboardPage(driver);
		return PageFactory.initElements(driver, DashboardPage.class);
		
		
	}
	
	public void loginInvalid(String uname, String pass) {
		System.out.println("Invalid Username:"+uname+" Pass: "+ pass);
	}
	
	public void forgetPwd(String emailId) {
		
	}
	
	public void signUp(String [] mandatoryFields) {
		
	}
	

}
