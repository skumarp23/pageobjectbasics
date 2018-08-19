package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
		
		//Using EGit plugin
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		
		ZohoAppPage zp = lp.doLogin("sushilkumarprajapati23@gmail.com", "June8184CISE$NS");
		zp.goToCRM();		
		
		AccountsPage account = Page.menu.goToAccounts();
		
		CreateAccountPage cap = account.goToCreateAccounts();
		cap.createAccount("Sushilkumar");
		
	}
	
	
}
