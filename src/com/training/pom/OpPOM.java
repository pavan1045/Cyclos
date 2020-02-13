package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpPOM {
private WebDriver driver; 
	
	public OpPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath="//input[@linkurl='grantLoan?memberId=10']")
	private WebElement submit;
	
	@FindBy(xpath="//input[@name='loan(amount)']")
	private WebElement amount;
	
	@FindBy(id="description")
	private WebElement desc;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit1;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit2;
	
	@FindBy(xpath="//input[@linkurl='searchLoans?memberId=10']")
	private WebElement submit3;
	
	@FindBy(xpath="//*[@id='menu15']/span[2]")
	private WebElement logout;
	
	
	public void grant()
	{
		this.submit.click();
	}
	
	public void amount(String amount)
	{
		this.amount.sendKeys(amount);
	}
	
	public void description(String desc)
	{
		this.desc.sendKeys(desc);
	}
	public void submit1()
	{
		this.submit1.click();
	}
	public void submit2()
	{
		this.submit2.click();
	}
	
	public void loan()
	{
		this.submit3.click();
	}
	
	public void logout()
	{
		this.logout.click();
	}
	
	
	
	
	

}
