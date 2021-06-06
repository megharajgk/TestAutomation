package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePages {
	
	public ActiTimePages(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//Create WebElement for UserName text field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}
	
	//Create WebElement for Password Text Field
	private WebElement pwd;
	
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Create WebElement for Login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oBtnLogin;
	
	public WebElement getLoginButton()
	{
		return oBtnLogin;
	}
	
	//Create WebElement for FlyOutWindow 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Create WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLnkLogout;
	public WebElement getLogoutLink()
	{
		return oLnkLogout;
	}

}
