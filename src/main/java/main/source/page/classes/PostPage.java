package main.source.page.classes;

import java.io.IOException;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PostPage {
	
	/*
	 * Webdriver variable
	 * Navigate class object	
	 */
	WebDriver driver;
	
	@FindBy(id="edit-content_ifr")
	private WebElement frameBody;
	
	@FindBy(id="tinymce")
	private WebElement inpBody;
	
	@FindBy(id="title")
	private WebElement inpTitle;
	
	@FindBy(id="publish-button")
	private WebElement btnPublish;
	
	//@FindBy(id="view-button")
	@FindBy(linkText="View Post")
	@CacheLookup
	private WebElement btnView;
	
	
	public PostPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void addNewPost() {
		
		DataDrivenTesting blogdata = new DataDrivenTesting();
		
		try {
			blogdata.readExcelFile();
		} catch (RowsExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int row=0; row<1 ; row++) {
		 inpTitle.sendKeys(blogdata.blogs[row][0].toString());
		 driver.switchTo().frame(frameBody);
		 inpBody.sendKeys(blogdata.blogs[row][1].toString());
		 driver.switchTo().parentFrame();
		 btnPublish.click();
		 btnView.click();
		}
	}
	
	/* 
	 * Call OR override navigate class method to navigate to different pages
	 */
	

}
