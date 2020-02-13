package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemLoginPOM {
private WebDriver driver; 
	
	public MemLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
   @FindBy(id="memberUsername")
   private WebElement memUserName;
   
   @FindBy(id="memberName")
   private WebElement memberName;
   
  /* @FindBy(xpath="//*[@id='tdContents']/table[1]/tbody/tr[2]/td/table/tbody/tr[8]/td/fieldset/table/tbody/tr[1]/td[4]/input")
   private WebElement submit;*/
   
   public void memberName(String memUserName){
	   this.memUserName.sendKeys(memUserName);
	   
   }
   
   public void fullName(String memberName)
   {
	   this.memberName.sendKeys(memberName);
   }
   
   }
