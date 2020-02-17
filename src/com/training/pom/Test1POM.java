package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Test1POM {
private WebDriver driver;

	
	public Test1POM(WebDriver driver) {

		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Submit' and @type='button']")
	private WebElement SubmitBtn;
	
	public void SubmitBtn() {
		this.SubmitBtn.click();
	}
	
	@FindBy(name="member(user).username")
	private WebElement Loginname;
	
	public void login(String Loginname) {
		this.Loginname.clear();
		this.Loginname.sendKeys(Loginname);
	}
	
	@FindBy(name="member(name)")
	private WebElement FullName;
	
	public void b(String FullName) {
		this.FullName.clear();
		this.FullName.sendKeys(FullName);
	}
	
	@FindBy(name="member(email)")
	private WebElement Email;
	
	public void c(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}
	
	@FindBy(name="member(customValues).value")
	private WebElement Brithday;
	
	public void d(String Brithday) {
		this.Brithday.clear();
		this.Brithday.sendKeys(Brithday);
	}
	
	@FindBy(id="_radio_2_0")
	private WebElement Gender;
	
	public void Gender() {
		this.Gender.click();
	}
	
	@FindBy(xpath="//input[@fieldname='address']")
	private WebElement Address;
	
	public void Address(String Address) {
		this.Address.clear();
		this.Address.sendKeys(Address);
	}
	
	@FindBy(xpath="//input[@fieldname='postalCode']")
	private WebElement Postalcode;
	
	public void Postalcode(String Postalcode) {
		this.Postalcode.clear();
		this.Postalcode.sendKeys(Postalcode);
	}
	
	@FindBy(xpath="//input[@fieldname='city']")
	private WebElement city;
	
	public void city(String city) {
		this.city.clear();
		this.city.sendKeys(city);
	}
	
	@FindBy(xpath="//input[@fieldname='phone']")
	private WebElement Phone;
	
	public void Phone(String Phone) {
		this.Phone.clear();
		this.Phone.sendKeys(Phone);
	}
	
	@FindBy(xpath="//input[@fieldname='mobilePhone']")
	private WebElement mobilePhone;
	
	public void mobilePhone(String mobilePhone) {
		this.mobilePhone.clear();
		this.mobilePhone.sendKeys(mobilePhone);
	}
	
	@FindBy(xpath="//input[@fieldname='fax']")
	private WebElement fax;
	
	public void fax(String fax) {
		this.fax.clear();
		this.fax.sendKeys(fax);
	}
	
	@FindBy(xpath="//input[@fieldname='url']")
	private WebElement url;
	
	public void url(String url) {
		this.url.clear();
		this.url.sendKeys(url);
	}
	
	@FindBy(name="member(user).password")
	private WebElement password;
	
	public void password(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	@FindBy(name="confirmPassword")
	private WebElement confirmPassword;
	
	public void confirmPassword(String confirmPassword) {
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(confirmPassword);
	}
	@FindBy(id="saveButton")
	private WebElement Submit1;
	
	public void Submit1() {
		this.Submit1.click();
		
	}
	
	@FindBy(id="btn")
	private WebElement ok;
	
	public void ok() {
		this.ok.click();
		}
	@FindBy(id="cyclosUsername")
	private WebElement userName;
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	@FindBy(id="cyclosPassword")
	public WebElement password1;
	public void password() {
		this.password1.clear(); 
		 }
	@FindBy(xpath="//input[@value='1']")
	private WebElement PassBtn;
	public void PassBtn() {
		this.PassBtn.click(); 
	}
	@FindBy(xpath="//input[@value='2']")
	private WebElement PassBtn2;
	public void PassBtn2() {
		this.PassBtn2.click(); 
	}
	@FindBy(xpath="//input[@value='3']")
	private WebElement PassBtn3;
	public void PassBtn3() {
		this.PassBtn3.click(); 
	}
	@FindBy(xpath="//input[@value='4']")
	private WebElement PassBtn4;
	public void PassBtn4() {
		this.PassBtn4.click(); 
	}
	@FindBy(xpath="//*[@id='virtualKeyboard']//div[2]//table//tbody//tr//td//input[@value='Submit']")
	private WebElement loginBtn;
	public void clickLoginBtn() {
		this.loginBtn.click(); 
}
	@FindBy(id="memberUsername")
	private WebElement membername;
	
	public void sendMemberName(String membername) {
		this.membername.clear();
		this.membername.sendKeys(membername);
	}
	@FindBy(xpath="//input[@linkurl='grantLoan?memberId=10']")
	private WebElement gloan;
	
	public void gloan() {
		this.gloan.click();
	}
	
	@FindBy(name="loan(amount)")
	private WebElement loan;
	
	public void loan(String loan) {
		this.loan.clear();
		this.loan.sendKeys(loan);
	}
	
	
	@FindBy(id="description")
	private WebElement descriptionBox;
	
	public void descriptionBox(String descriptionBox) {
		this.descriptionBox.clear();
		this.descriptionBox.sendKeys(descriptionBox);
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submit11;
	
	public void Submit11() {
		this.Submit11.click();
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submit2;
	
	public void Submit2() {
		this.Submit2.click();
	}

	@FindBy(name="captcha")
	private WebElement captcha;
	
	
	public String actual(){
		Alert alt=driver.switchTo().alert();
		String actual=alt.getText();
		return actual;
	}
	
	public void alertHandle() {
	
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}

	/*public void alertHandle2() {
		Alert alert=driver.switchTo().alert();
		String expected="The loan was successfully granted";
		String actual=alert.getText();
		Assert.assertEquals(expected, actual);
		alert.accept();
		
	}*/
	
	

	
	
	
	
	
	
	
	
	
}

