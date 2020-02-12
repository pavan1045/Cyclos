package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TestPom;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MemberListTest {
	private WebDriver driver;
	private String baseUrl;
	private TestPom TestPom;
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
		TestPom = new TestPom(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test (priority=0)
	public void validLoginTest() {
		TestPom.sendUserName("admin");
		TestPom.pwd1(); 
		TestPom.pwd2(); 
		TestPom.pwd3(); 
		TestPom.pwd4(); 

		TestPom.SubmitBtn(); 
		screenShot.captureScreenShot("First");
		TestPom.member();
		TestPom.memberlink();

		TestPom.date();

		TestPom.select();

		TestPom.print();

		
	}

 }
