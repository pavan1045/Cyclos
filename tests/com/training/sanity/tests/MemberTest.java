package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Member1POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MemberTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Member1POM member1POM;
	
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
		loginPOM = new LoginPOM(driver);
		member1POM = new Member1POM(driver); 
		
		
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
	@Test
	public void validLoginTest1() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	 member1POM.sendUsername("admin");
	 member1POM.sendPassword();
	 member1POM.PassBtn1();
	 member1POM.PassBtn2();
	 member1POM.PassBtn3();
	 member1POM.PassBtn4();
	 member1POM.SubmitBtn();
	 
	 member1POM.Messages();
	//Thread.sleep(3000);
	 member1POM.subMessages();
	 member1POM.selectSent();
	 member1POM.Submit();
	 member1POM.memberLogin();
	 member1POM.Subject();
	 
	 driver.switchTo().parentFrame();
	 member1POM.Body();
	 member1POM.Submit1();
	 
	 member1POM.alertHandle();
	
	}

 
}
