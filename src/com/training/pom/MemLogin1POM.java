package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemLogin1POM {
private WebDriver driver; 
	
	public MemLogin1POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='v']")
	private WebElement pwd1;
	
	@FindBy(xpath="//input[@value='i']")
	private WebElement pwd2;
	
	@FindBy(xpath="//input[@value='d']")
	private WebElement pwd3;
	
	@FindBy(xpath="//input[@value='y']")
	private WebElement pwd4;
	
	@FindBy(xpath="//input[@value='a']")
	private WebElement pwd5;
	
	
	public void userName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void password(String xpath) {
		this.password.clear();
		this.password.sendKeys(xpath); 
	}
	 public void pwd1(){
		this.pwd1.click();
	 }
	 public void pwd2(){
		this.pwd2.click();
	 }
	 public void pwd3()
	 {

		this.pwd3.click();}
	 public void pwd4(){

		this.pwd4.click();
	 }
	 public void pwd5(){

			this.pwd5.click();
	 }
	 @FindBy(xpath="//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")
	 private WebElement  SubmitBtn;
	
	public void Submit() {
		this.SubmitBtn.click(); 
	}



}
