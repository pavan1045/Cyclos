package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAdminPOM {
private WebDriver driver; 
	
	public TestAdminPOM(WebDriver driver) {
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
	

}
