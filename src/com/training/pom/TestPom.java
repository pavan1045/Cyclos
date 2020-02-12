package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPom {
		private WebDriver driver; 
		
		public TestPom(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="cyclosUsername")
		private WebElement userName; 
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(xpath="//input[@value='1']")
		private WebElement pwd1;
		
		@FindBy(xpath="//input[@value='2']")
		private WebElement pwd2;
		
		@FindBy(xpath="//input[@value='3']")
		private WebElement pwd3;
		
		@FindBy(xpath="//input[@value='4']")
		private WebElement pwd4;
		
		//@FindBy(xpath="//input[@value='Submit']")
		// private WebElement SubmitBtn; 
		
		public void sendUserName(String userName) {
			this.userName.clear();
			this.userName.sendKeys(userName);
		}
		
		public void sendPassword(String xpath) {
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
		 @FindBy(xpath="//*[@id='virtualKeyboard']/div[2]/table/tbody/tr[2]/td/input[3]")
		 private WebElement  SubmitBtn;
		
		public void SubmitBtn() {
			this.SubmitBtn.click(); 
		}
		
		@FindBy(xpath="//*[@id='menu13']/span[2]")
		private WebElement memberlist;
		
		@FindBy(xpath="//*[@id='submenu13.1']/span[2]")
		private WebElement memberlistlink;
		
		@FindBy(xpath="//input[@value='PERIOD_CURRENT']")
		private WebElement date;
		
		@FindBy(id="selectAllButton")
		private WebElement select;
		
		@FindBy(id="printReportButton")
		private WebElement print;
		
		public void member()
		{
			this.memberlist.click();
		}

		public void memberlink()
		{
			this.memberlistlink.click();
		}
		
		public void date()
		{
			this.date.click();
		}
		
		public void select()
		{
			this.select.click();
		}
		
		public void print()
		{
			this.print.click();
		}






		
		
		
		
		

		

}
