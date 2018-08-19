package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {

	/*
	 * TopMenu ISA Page??? - no
	 * 
	 * HomePage HASA TopMenu - encapsulation
	 * AccountsPage HASA TopMenu - encapsulation
	 * 
	 * Page HASA TopMenu - encapsulation
	 */
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	
	public void goToHome() {

	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public AccountsPage goToAccounts() {
	
		Page.click("accountstab_XPATH");
		
		return new AccountsPage();
		
	}

	public void goToDeals() {

	}

	public void goToActivities() {

	}

	public void goToReports() {

	}

	public void goToAnalytics() {

	}

	public void signOut() {

	}

}
