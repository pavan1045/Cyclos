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
import com.training.pom.TestAdminPOM;
import com.training.pom.TestMemPOM;
import com.training.pom.TestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestPayments {
	private WebDriver driver;
	private String baseUrl;
	private  TestAdminPOM testadminPOM;
	private TestMemPOM testmemPOM;
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
		//testPOM = new TestPOM(driver); 
		testmemPOM=new TestMemPOM(driver);
		testadminPOM = new TestAdminPOM(driver);
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
	@Test (priority=1)
	public void validLoginTest() throws InterruptedException {
		
		testadminPOM.sendUserName("admin");
		testadminPOM.pwd1();
		testadminPOM.pwd2();
		testadminPOM.pwd3();
		testadminPOM.pwd4();
		testadminPOM.SubmitBtn(); 
		Thread.sleep(3000);
	}
	@Test (priority=2)
	public void memInput() throws InterruptedException{
		testmemPOM.memUsername("R");
		Thread.sleep(2000);
		testmemPOM.makePayment();
		Thread.sleep(2000);
		testmemPOM.memAmount();
		Thread.sleep(2000);
		testmemPOM.select();

		testmemPOM.desc();
		Thread.sleep(2000);
		testmemPOM.btn1();
		Thread.sleep(2000);
		testmemPOM.btn2();
		Thread.sleep(2000);
		testmemPOM.btn3();
		Thread.sleep(2000);
		testmemPOM.accinfo();

	}
}