package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMemPOM {

private WebDriver driver; 
	
	public TestMemPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="memberUsername")
	private WebElement memusername;
	
	public void memUsername(String memusername) {
		this.memusername.clear();
		this.memusername.sendKeys(memusername);
	}
	@FindBy(xpath="//*[@id='tdContents']//table[1]//tbody//tr[2]//td//table//tbody//tr[5]//td//fieldset//table//tbody//tr[2]//td[2]//input")
	private WebElement makepayment;
	
	public void makePayment()
	{
		this.makepayment.click();
	}
	
	@FindBy(xpath="//*[@id='amount']")
	private WebElement amount;
	
	public void memAmount()
	{
		this.amount.sendKeys("2000");
	}
	
	@FindBy(xpath="//*[@id='type']")
	private WebElement sel;
	
	public void select(){
		Select s1=new Select(sel);
		s1.selectByIndex(1);
	}
	
	@FindBy(id="description")
	private WebElement des;
	
	public void desc(){
	this.des.sendKeys("BirthDay Gift");					
	}
	
	@FindBy(xpath="//*[@id='submitButton']")
	private WebElement button1;
	
	public void btn1(){
		this.button1.click();	
	}
	
	@FindBy(xpath="//*[@id='tdContents']//form//table[1]//tbody//tr[2]//td//table//tbody//tr[6]//td//input")
	private WebElement button2;
	
	public void btn2(){
		this.button2.click();
	}
	
	@FindBy(id="backToMemberProfileButton")
	private WebElement button3;
	
	public void btn3(){
		this.button3.click();
	}
	
	@FindBy(xpath="//input[@linkurl='accountOverview?memberId=10']")
	private WebElement accinfo;
	
	public void accinfo()
	{
		this.accinfo.click();
		String Expected="BirthDay Gift";
		  String actual=driver.findElement(By.xpath("//*[@id='tdContents']//table[1]//tbody//tr[3]//td//table//tbody//tr[2]//td[3]")).getText();
		  Assert.assertEquals(Expected, actual);
	}
	
	
	
	
}
