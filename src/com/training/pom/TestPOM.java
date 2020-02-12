package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPOM {
private WebDriver driver; 
	
	public TestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	 @FindBy(xpath="//input[@value='1']")
	 private WebElement pwd1;
	 @FindBy(xpath="//input[@value='2']")
	 private WebElement pwd2;
	
	 @FindBy(xpath="//input[@value='3']")
	 private WebElement pwd3;
	
	 @FindBy(xpath="//input[@value='4']")
	 private WebElement pwd4;
	  @FindBy(xpath="//input[@type='submit']")
	  private WebElement Submit;
	  @FindBy(xpath="//li[@id='menu3']//span[@class='menuText']")
	  private WebElement account;
	  @FindBy(xpath="//*[@id='submenu3.6']")
	  private WebElement payment;
	  @FindBy(id="memberUsername")
		private WebElement loginName;
	  
	  @FindBy(id="memberName")
		private WebElement ReceipientName;
	  
	  @FindBy(id="amount")
		private WebElement Amount;
	  
	  @FindBy(xpath="//textarea[@name='description']")
		private WebElement Description;
	  
	  @FindBy(id="submitButton")
		private WebElement Submit1;
	  
	  @FindBy(xpath="//input[@value='Submit']")
	  private WebElement Submit2;
	  
		
	  
	
	
	public void sendUserName(String userName) {
		this.userName.click();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String xpath) {
		this.password.click(); 
	}
	public void pwd1()
	{
		this.pwd1.click();
	}

	public void pwd2()
	{
		this.pwd2.click();
	}

	public void pwd3()
	{
		this.pwd3.click();
	}

	public void pwd4()
	{
		this.pwd4.click();
	}

	
	public void SubmitBtn() {
		this.Submit.click(); 
	}
	public void account()
	{
		this.account.click();
	}
	public void payment()
	{
		this.payment.click();
	}
	public void memberUserName(String loginName) {
		this.loginName.clear();
		this.loginName.sendKeys(loginName);
	}
	public void memberName(String ReceipientName) {
		this.ReceipientName.clear();
		this.ReceipientName.sendKeys(ReceipientName);
	}
	
	public void amount(String Amount) {
		this.Amount.clear();
		this.Amount.sendKeys(Amount);
	}
	public void description(String Description) {
		this.Description.clear();
		this.Description.sendKeys(Description);
	}
	public void SubmitBtn1() {
		this.Submit1.click(); 
	}
	public void SubmitBtn2() {
		this.Submit2.click(); 
	}





}
