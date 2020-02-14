package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ComplexPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ComplexTest {
	private WebDriver driver;
	private String baseUrl;
	private ComplexPOM ComplexPOM;
	//private Complex1POM Complex1POM;
	//private Complex2POM Complex2POM;
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
		ComplexPOM = new ComplexPOM(driver); 
		//Complex2POM=new Complex2POM(driver);
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
	@Test (priority=0)
	public void validLoginTest1() throws InterruptedException {
		ComplexPOM.sendUserName("admin");
		ComplexPOM.pwd1(); 
		ComplexPOM.pwd2(); 
		ComplexPOM.pwd3(); 
		ComplexPOM.pwd4(); 
        ComplexPOM.SubmitBtn(); 
	    //screenShot.captureScreenShot("First");
		ComplexPOM.member();
		ComplexPOM.memberlink();
		ComplexPOM.date();
        ComplexPOM.select();
		ComplexPOM.print();	
        ComplexPOM.Statistical();
        ComplexPOM.Key();
		
		
	}
}