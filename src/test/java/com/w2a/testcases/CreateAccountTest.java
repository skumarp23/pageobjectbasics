package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

import utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data){
		
		ZohoAppPage zp =  new ZohoAppPage();
		zp.goToCRM();		
		
		AccountsPage account = Page.menu.goToAccounts();
		
		CreateAccountPage cap = account.goToCreateAccounts();
		cap.createAccount(data.get("accountName"));
		
		//Assert.fail("Create account test failed");
		
	}
	
}
