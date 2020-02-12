package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class LoginTest{
	private WebDriver driver;
	private String baseUrl;
	private  TestPOM testPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	@BeforeClass
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		testPOM = new TestPOM(driver); 
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
	
	@Test
	public void validLoginTest() {
		testPOM.sendUserName("admin");
		testPOM.pwd1();
		testPOM.pwd2();
		testPOM.pwd3();
		testPOM.pwd4();


		testPOM.SubmitBtn(); 
	}
		
		@Test (priority=1)
		public void accountLink(){
			testPOM.account(); 
		}
		
		@Test (priority=2)
		public void memPayClick(){
		testPOM.payment(); 
		}
		
		@Test (priority=3)
		public void memInput() throws InterruptedException{
		testPOM.memberUserName("R"); 
		Thread.sleep(4000);
		//testPOM.memberName("samsaravananam"); 
		testPOM.amount("10,00"); 
		testPOM.description("system");
		testPOM.SubmitBtn1(); 
		}
		
		
		@Test (priority=4)
		public void finalSubmit(){
		testPOM.SubmitBtn2(); 
		screenShot.captureScreenShot("First");
		}
		






		
		
	
}
