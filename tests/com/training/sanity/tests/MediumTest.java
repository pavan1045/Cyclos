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

import com.training.generics.ScreenShot;
import com.training.pom.MemLogin1POM;
import com.training.pom.MemLoginPOM;
import com.training.pom.MemOpPOM;
import com.training.pom.OpPOM;
import com.training.pom.PLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MediumTest {
	private WebDriver driver;
	private String baseUrl;
	private PLoginPOM PLoginPOM;
	private MemLoginPOM MemLoginPOM;
	private OpPOM OpPOM;
	private MemLogin1POM MemLogin1POM;
	private MemOpPOM MemOpPOM;




	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		PLoginPOM = new PLoginPOM(driver); 
		MemLoginPOM = new MemLoginPOM(driver); 
		OpPOM = new OpPOM(driver); 
		MemLogin1POM = new MemLogin1POM(driver);
		MemOpPOM = new MemOpPOM(driver); 




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
	@Test(priority=0)
	public void validLoginTest() {
		PLoginPOM.sendUserName("admin");
		PLoginPOM.pwd1(); 
		PLoginPOM.pwd2(); 
		PLoginPOM.pwd3(); 
		PLoginPOM.pwd4(); 
		PLoginPOM.SubmitBtn(); 
		//screenShot.captureScreenShot("First");
	}
	
	
		@Test (priority=1)
		public void memberLogin()
		{

		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(-500,document.body.scrollHeight)");
		MemLoginPOM.memberName("Vidya");
		MemLoginPOM.fullName("seerla");
		}
		
		
	
		@Test(priority=2)
		public void grant() throws InterruptedException
		{
		JavascriptExecutor j1=(JavascriptExecutor)driver;
		j1.executeScript("window.scrollTo(-500,document.body.scrollHeight)");
		OpPOM.grant();
		OpPOM.amount("100000");
        OpPOM.description("Home Loan");
		OpPOM.submit1();
		OpPOM.submit2();
		Alert a=driver.switchTo().alert();	
	    a.accept();
		OpPOM.loan();
		OpPOM.logout();
		Alert a1=driver.switchTo().alert();	
		a1.accept();
		}
		
		
		@Test(priority=3)
		public void memlogin()
		{
		MemLogin1POM.userName("Vidya");
		MemLogin1POM.pwd1();
		MemLogin1POM.pwd2();

		MemLogin1POM.pwd3();
		MemLogin1POM.pwd4();
		MemLogin1POM.pwd5();
		MemLogin1POM.Submit();
		MemOpPOM.account();
		MemOpPOM.loans();
		}





	    


		
		

	}
   