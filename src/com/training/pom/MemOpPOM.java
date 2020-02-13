package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MemOpPOM {
private WebDriver driver; 
	
	public MemOpPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='menu2']/span[2]")
	private WebElement account;
	
	@FindBy(xpath="//*[@id='submenu2.0']/span[2]")
	private WebElement accinfo;
	 public void account()
	 {
		 this.account.click();
	 }
	 
	 public void accinfo()
	 {
		 this.accinfo.click();
		 String actual=this.accinfo.getText();
		 String expected="Account Information";
		 Assert.assertEquals(actual, expected);
		 
	 }
	


}
