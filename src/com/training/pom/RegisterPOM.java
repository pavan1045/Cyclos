package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPOM {
private WebDriver driver; 
	
	public RegisterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='button' and @value='Submit']")
	private WebElement clkSubBut;
	
	@FindBy(name="member(user).username")
	private WebElement loginName;
	
	@FindBy(name="member(name)")
	private WebElement fullName;
	
	@FindBy(name="member(email)")
	private WebElement email;
	
	@FindBy(xpath="//input[@fieldname='birthday']")
	private WebElement birthday;
	
	
	
	@FindBy(xpath="//label[@for='_radio_2_0']")
	private WebElement Female;
	
	@FindBy(xpath="//label[@for='_radio_2_1']")
	private WebElement Male;
	
	
	
	//@FindBy(id="_radio_2_0")
	//private WebElement gender;
	
	@FindBy(xpath="//input[@fieldname='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@fieldname='postalCode']")
	private WebElement code;
	
	@FindBy(xpath="//input[@fieldname='city']")
	private WebElement city;
	
	@FindBy(id="custom_field_select_6")
	private WebElement area;
	
	@FindBy(xpath="//input[@fieldname='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@fieldname='mobilePhone']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@fieldname='fax']")
	private WebElement fax;
	
	@FindBy(xpath="//input[@fieldname='url']")
	private WebElement url;
	
	@FindBy(xpath="//input[@type='password' and @name='member(user).password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@type='password' and @name='confirmPassword']")
	private WebElement confirm;
	
	@FindBy(xpath="//input[@name='captcha']")
	private WebElement captcha;
	
	@FindBy(xpath="//input[@id='saveButton']")
	private WebElement saveBtn;
	
	
	public void clicksubmit1(){
		this.clkSubBut.click();
	}
	
	public void sendloginName(String loginName ){
		this.loginName.sendKeys(loginName);
	}
	
	public void sendFullName(String fullName){
		this.fullName.sendKeys(fullName);
	}
	
	public void sendEmail(String email){
		this.email.sendKeys(email);
	}
	
	/*public void sendBirthday(String birthday){
		this.birthday.sendKeys(birthday);
	}
*/	
	
	
	public void gender(String Gender){
		System.out.println(Gender);
		if(Gender=="Female")
		{
			this.Male.click();
		}
		else
		{
			this.Male.click();
		}
		
	}
	public void sendAdress(String address){
		this.address.sendKeys(address);
	}
	public void sendPostalCode(String code){
		this.code.sendKeys(code);
	}
	public void sendCity(String city){
		this.city.sendKeys(city);
	}
	public void sendArea(){
		this.area.click();
		Select s=new Select(this.area);
		s.selectByVisibleText("Example area");
	}
	public void sendPhone(String phone){
		this.phone.sendKeys(phone);
	}
	public void sendMobile(String mobile){
		this.mobile.sendKeys(mobile);
	}
	public void sendFax(String fax){
		this.fax.sendKeys(fax);
	}
	public void sendUrl(String url){
		this.url.sendKeys(url);
	}
	public void sendPass(String pass){
		this.pass.sendKeys(pass);
	}
	public void sendConfirm(String confirm){
		this.confirm.sendKeys(confirm);
	}
	public void sendCaptcha(){
		this.captcha.click();
	}
	
	public void clickSave(){
		this.saveBtn.click();;
	}
	
	
	
}
