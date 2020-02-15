
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegisterTest {
	private WebDriver driver;
	private String baseUrl;
	private RegisterPOM RegisterPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegisterPOM = new RegisterPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);

			}
	

	/*@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegisterPOM = new RegisterPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}*/
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test (dataProvider="Excel", dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String loginName,String fullName,String Email,String Address,String postalCode,String city,String phone,String mobilePhone,String fax,String url,String password,String confirmPassword) throws InterruptedException {
		RegisterPOM.clicksubmit1();
		RegisterPOM.sendloginName(loginName);
		RegisterPOM.sendFullName(fullName);
		RegisterPOM.sendEmail(Email);
		RegisterPOM.sendBirthday("1998/09/17");
		Thread.sleep(3000);
		RegisterPOM.gender();
		RegisterPOM.sendAdress(Address);
		RegisterPOM.sendPostalCode(postalCode);
		RegisterPOM.sendCity(city);
		RegisterPOM.sendArea();
		RegisterPOM.sendPhone(phone);
		RegisterPOM.sendMobile(mobilePhone);
		RegisterPOM.sendFax(fax);
		RegisterPOM.sendUrl(url);
		RegisterPOM.sendPass(password);
		RegisterPOM.sendConfirm(confirmPassword);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(-500,document.body.scrollHeight)" );
		RegisterPOM.sendCaptcha();
		Thread.sleep(9000);
		RegisterPOM.clickSave();
		//Alert a=driver.switchTo().alert();	
	  // a.accept();
		RegisterPOM.ok();
	



				
		//screenShot.captureScreenShot("First");

	}

}

