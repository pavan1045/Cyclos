package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.TestAdminPOM;
import com.training.pom.TestMemPOM;
import com.training.pom.TestMesAdminPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestMess {
	
		private WebDriver driver;
		private String baseUrl;
		private TestMesAdminPOM testmesadminPOM;
		private static Properties properties;
		private ScreenShot screenShot;

		@BeforeTest
		public void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}
		@BeforeClass
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			testmesadminPOM = new TestMesAdminPOM(driver);
			baseUrl = properties.getProperty("baseURL");
			
			driver.get(baseUrl);
		}
  
  
  
  

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test 
	public void validLoginTest() throws InterruptedException {
		
		testmesadminPOM.sendUserName("admin");
		testmesadminPOM.pwd1();
		testmesadminPOM.pwd2();
		testmesadminPOM.pwd3();
		testmesadminPOM.pwd4();
		testmesadminPOM.SubmitBtn(); 
		
	}
	
	@Test (priority=1, dataProvider="cyclos",dataProviderClass=LoginDataProviders.class)
public void memInput( String mem_login,String Member_Login,String Subject,String Body) throws InterruptedException{
		testmesadminPOM.memLogin1(mem_login);
		testmesadminPOM.Messages();
		
		testmesadminPOM.messageLink();
		testmesadminPOM.select();
		testmesadminPOM.newMessage();
		
		
		testmesadminPOM.memLogin(Member_Login);
		Thread.sleep(2000);
		testmesadminPOM.subjectTextbox(Subject);
		driver.switchTo().parentFrame();
		testmesadminPOM.bodyTextbox(Body);
		
		testmesadminPOM.submitBtn();
		testmesadminPOM.alertHandle();
		Thread.sleep(3000);
		testmesadminPOM.searchResults();
		driver.close();
}
}

