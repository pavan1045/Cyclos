
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
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegisterPOM = new RegisterPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test (dataProvider="Excel", dataProviderClass=LoginDataProviders.class)
	public void validLoginTest(String Login_name,String Full_name,String E_Mail,String Birthday,String Gender,String Address,String Postal_Code,String City,String Phone,String MobilePhone,String Fax,String Url,String Password,String ConfirmPassword) throws InterruptedException {
		RegisterPOM.clicksubmit1();
		RegisterPOM.sendloginName(Login_name);
		RegisterPOM.sendFullName(Full_name);
		RegisterPOM.sendEmail(E_Mail);
		//RegisterPOM.sendBirthday(Birthday);
		Thread.sleep(3000);
		RegisterPOM.gender(Gender);
		RegisterPOM.sendAdress(Address);
		RegisterPOM.sendPostalCode(Postal_Code);
		RegisterPOM.sendCity(City);
		RegisterPOM.sendArea();
		RegisterPOM.sendPhone(Phone);
		RegisterPOM.sendMobile(MobilePhone);
		RegisterPOM.sendFax(Fax);
		RegisterPOM.sendUrl(Url);
		RegisterPOM.sendPass(Password);
		RegisterPOM.sendConfirm(ConfirmPassword);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(-500,document.body.scrollHeight)" );
		RegisterPOM.sendCaptcha();
		Thread.sleep(9000);
		RegisterPOM.clickSave();
		Alert a=driver.switchTo().alert();	
	    a.accept();

				
		//screenShot.captureScreenShot("First");

	}

}

