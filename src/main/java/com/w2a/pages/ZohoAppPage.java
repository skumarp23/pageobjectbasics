package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{

	
	
	public void goToBooks(){
		
		driver.findElement(By.cssSelector(".zicon-apps-books.zicon-apps-96")).click();
		
	}
	
	public void goToCliq(){
		
		driver.findElement(By.cssSelector(".zicon-apps-chat.zicon-apps-96")).click();
		
	}
	
	public CRMHomePage goToCRM(){
		
		click("crmlink_CSS");
		
		return new CRMHomePage();
		
	}
	
	public void goToMeeting(){
		
		driver.findElement(By.cssSelector(".zicon-apps-meeting.zicon-apps-96")).click();
		
	}
	
	public void goToSalesIQ(){
		
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
		
	}
	
	
}
