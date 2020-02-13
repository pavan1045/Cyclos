package com.training.sanity.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoanTest {
	public WebDriver driver;
	@BeforeClass
	public void launch()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Training\\Selenium jar\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8585/do/login");
		
		driver.findElement(By.id("cyclosUsername")).sendKeys("satya");
		driver.findElement(By.id("cyclosPassword")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='3']")).click();
		driver.findElement(By.xpath("//input[@value='4']")).click();
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
	}
  @Test
  public void Account()
  {
	   driver.findElement(By.xpath("//li[@id='menu2']//span[@class='menuText']")).click();
  }
  
  @Test(priority=1)
  public void Loans() 
  {
	   driver.findElement(By.xpath("//*[@id='submenu2.3']//span[2]")).click();
	 //  Thread.sleep(1000);
}
  @Test(priority=2)
  public void View()
  {
	   driver.findElement(By.xpath("//img[@loanid='4']")).click();
	   
}
  @Test(priority=3)
  public void Amount()
  {
	   driver.findElement(By.id("amountText")).clear();
	   driver.findElement(By.id("amountText")).sendKeys("5000");
	   Alert alt=driver.switchTo().alert();
	   String alert=alt.getText();
	   System.out.println(alert);
	   alt.accept();
}
  @Test(priority=4)
  public void Repay()
  {
	   driver.findElement(By.xpath("//input[@value='Repay']")).click();
	   Alert alt1=driver.switchTo().alert();
	   String alert1=alt1.getText();
	   System.out.println(alert1);
	   alt1.accept();
}

	  
 }
