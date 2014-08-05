package main.source.page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='//wordpress.com/post/']")
	private WebElement btnCreatePost;

	public DashboardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	/*
	 * Variables :
	 * Navigate class object
	 */
	public PostPage navigate() {
		
		//driver.findElement(By.xpath("//a[@href='//wordpress.com/post/']")).click();
		btnCreatePost.click();
		
		//return new PostPage(driver);
		return PageFactory.initElements(driver, PostPage.class);
	}

	/* 
	 * Call OR override navigate class method to navigate to different pages
	 */

}
