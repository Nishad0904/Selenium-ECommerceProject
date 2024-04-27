package com.ect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpages {
	 WebDriver driver;
	public Loginpages(WebDriver ldriver) { 	
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[2]/a") WebElement logimage;
	
	@FindBy(id="email") WebElement email;
	
	@FindBy(id="password") WebElement pass;
	
	@FindBy(id="customerloginForm") WebElement sub;
	
	@FindBy(xpath="//*[@class=\"btn dropdown-toggle ml-3\"]") WebElement logoutimage;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[2]/div/div/a[2]") WebElement logoutclick;
	
	public void portalLogin(String username, String password) {
		
		logimage.click();
		email.sendKeys(username);
		pass.sendKeys(password);
		sub.click();
	}
	
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		logoutimage.click();
		logoutclick.click();
		
	}
}
