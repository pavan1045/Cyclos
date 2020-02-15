package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestMesAdminPOM {

	
private WebDriver driver; 
	
	public TestMesAdminPOM(WebDriver driver) {
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
	
	
	@FindBy(xpath="//*[@id='memberUsername']")
	private WebElement memberlogin;
	
	public void memLogin1(String login){
		this.memberlogin.sendKeys(login);
	}
	

	@FindBy(xpath="//*[@id='menu8']/span[2]")
	private WebElement messages;

	public void Messages(){
		this.messages.click();
	}

	@FindBy(xpath="//*[@id='submenu8.0']/span[2]")
	private WebElement messageslink;

	public void messageLink(){
		this.messageslink.click();
	}

	@FindBy(id="messageBoxSelect")
	private WebElement messsagetype;

	public void select(){
		Select s1=new Select(messsagetype);
		s1.selectByIndex(1);
	}
	
	

	@FindBy(id="newButton")
	private WebElement button;

	public void newMessage(){
		this.button.click();
	}
	
	

	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input[2]")
	private WebElement memlogin;

	public void memLogin(String logname){
		this.memlogin.sendKeys(logname);
	}
	
	@FindBy(id="subjectText")
	private WebElement subject;

	public void subjectTextbox(String subject1){
		this.subject.sendKeys(subject1);
	}
	
	@FindBy(tagName="iframe")
	private WebElement body;

	public void bodyTextbox(String body1){
		this.body.sendKeys(body1);
	}

	@FindBy(xpath="//input[@type='submit' and @value='Submit']")
	private WebElement submitbtn;

	public void submitBtn(){
		this.submitbtn.click();
	}
	
	public void alertHandle(){
		Alert a=driver.switchTo().alert();
	String alert=a.getText();
		System.out.println(alert);
		a.accept();
	}

	

	public void searchResults()
	{

		String Expected="loan";
		String actual=driver.findElement(By.xpath("//*[@id='tdContents']//form[2]//table[1]//tbody//tr[2]//td//table//tbody//tr[2]//td[3]//table//tbody//tr//td[2]")).getText();
		Assert.assertEquals(Expected, actual);
	}



}
