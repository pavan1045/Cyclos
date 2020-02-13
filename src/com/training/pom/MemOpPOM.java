package com.training.pom;

import static org.testng.Assert.assertEquals;

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
	
	@FindBy(xpath="//*[@id='submenu2.3']/span[2]")
	private WebElement loans;
	
	public void account()
	{
		this.account.click();
	}
	public void loans()
	{
		this.loans.click();
		String actual=this.loans.getText();
		String expected="Loans";
		Assert.assertEquals(actual, expected);
	}
	
	


}
