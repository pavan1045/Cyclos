package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccPOM {
private WebDriver driver; 
	
	public AccPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//*[@id='menu3']")
	private WebElement account;
	
	@FindBy(xpath="//*[@id='submenu3.6']/span[2]")
	private WebElement memeber;
	
	@FindBy(id="memberUsername")
	private WebElement memberuserName; 

	//@FindBy(id="memberName")
	//private WebElement memberName; 
	
	
	@FindBy(name="amount")
	private WebElement amount;
	
	@FindBy(id="type")
	private WebElement type;

	@FindBy(name="description")
	private WebElement description;

	@FindBy(id="submitButton")
	private WebElement submit;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submit1;
	 
	@FindBy(xpath="//*[@id='menu15']/span[2]")
	private WebElement logout;
	
	public void account()
	{
		this.account.click();
	}
	
	public void memeber()
	{
		this.memeber.click();
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	}
	
	
	public void sendUserName(String memberuserName) {
		
		this.memberuserName.sendKeys(memberuserName);
			
	}
	
	/*public void sendMemberName(String memberName) {

		this.memberName.sendKeys(memberName);
	}
*/	
	public void amount(String amount) {
		
		this.amount.sendKeys(amount);
	}
	 
	public void List()
	
	{
		this.type.click();
		Select s=new Select(this.type);
		s.selectByIndex(1);
	}
	
public void description(String description) {
		
		this.description.sendKeys(description);
	}

  public void submit(){
	  this.submit.click();
  }
  public void Submit1(){
	  this.Submit1.click();
  }
  public void logout(){
	  this.logout.click();
  }

}
