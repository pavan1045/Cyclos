package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.Test1POM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Test2 {
	private WebDriver driver;
	private String baseUrl;
	private Test1POM Test1POM;
	private static Properties properties;
	private WebDriverWait webDriverWait;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Test1POM = new Test1POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void ValidTest_Step2() throws InterruptedException{
	
		Test1POM.SubmitBtn();
		Test1POM.login("sata110");
		Test1POM.b("satya141");
		Test1POM.c("satya14@gmail.com");
		Test1POM.d("26-04-1987");
		Test1POM.Gender();
		Test1POM.Address("Bangalore");
		Test1POM.Postalcode("560054");
		Test1POM.city("Bangalore");
		Test1POM.Phone("1445051410");
		Test1POM.mobilePhone("19230051410");
		Test1POM.fax("987764751");
		Test1POM.url("www.google.com");
		Test1POM.password("satya12345");
		Test1POM.confirmPassword("satya12345");
		
		//WebDriverWait wait = new WebDriverWait((WebDriver) Test1POM,30);
		
		Thread.sleep(20000);

		//Test1POM.waitT();
		

		
		/*Test1POM.waitTime();
		WebDriverWait a= new WebDriverWait(driver, 10);
		Test1POM.waitForVisibilityOfElementLocatedBy(name);*/
		Test1POM.Submit1();
		
		Test1POM.ok();
		Test1POM.sendUserName("admin");
		Test1POM.PassBtn();
		Test1POM.PassBtn2();
		Test1POM.PassBtn3();
		Test1POM.PassBtn4();
		Test1POM.clickLoginBtn();
		
		
		
		
		Test1POM.sendMemberName("sushmitha");
		Test1POM.gloan();
		Test1POM.loan("100000");
	
		Test1POM.descriptionBox("home loan");
		Test1POM.Submit11();
		Test1POM.Submit2();
		
		String expected ="The loan was successfully granted";
		
		String actual=Test1POM.actual();
		Assert.assertEquals(expected, actual);
		System.out.println("Message is displayed");
		
		
		
		Test1POM.alertHandle();
		//Test1POM.alertHandle2();
		
		
		
		
		
		
		
		
		
	}
	
}
