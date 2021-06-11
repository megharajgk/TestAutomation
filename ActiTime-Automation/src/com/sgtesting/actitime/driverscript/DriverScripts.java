package com.sgtesting.actitime.driverscript;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialization;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Users;

public class DriverScripts {

	public static void main(String[] args) {
		WebDriver oBrowser=null;
		
		//Create User Scenario
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		
		//Modify User Scenario
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.modifyUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		
		

	}

}
