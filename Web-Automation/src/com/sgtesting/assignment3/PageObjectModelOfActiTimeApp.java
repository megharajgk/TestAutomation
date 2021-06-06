package com.sgtesting.assignment3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelOfActiTimeApp 
{
	public static WebDriver driver=null;
	public PageObjectModelOfActiTimeApp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//To create WebElement for UserName text field
	
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//To create WebElement for Password text field
	
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//To create WebElement for Login button
	
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement loginButton;
	public WebElement clickLoginButton()
	{
		return loginButton;
	}
	
	//To create WebElement to close the flyOutWindow
	
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement closeFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//To create WebElement for logout link
	
	@FindBy(linkText="Logout")
	private WebElement logout;
	public WebElement clickLogout()
	{
		return logout;
	}
	
	//To create WebElement to click on USER
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
	private WebElement clickUser;
	public WebElement clickOnUser() 
	{
		return clickUser;
	}
	
	//To create WebElement to click on Add user
	@FindBy(xpath="//*[@id='createUserDiv']/div")
	private WebElement addUser;
	public WebElement clickOnAddUser()
	{
		return addUser;
	}
	
	//To create WebElement To write in FirstName text field
	private WebElement firstName;
	public WebElement firstnameTextField()
	{
		return firstName;
	}
	
	//To create WebElement To write in LastName text field
	private WebElement lastName;
	public WebElement lastnameTextField()
	{
		return lastName;
	}
	
	//To create WebElement To write in email text field
	private WebElement email;
	public WebElement emailTextField()
	{
		return email;
	}
	
	//To create WebElement To write in email text field
	private WebElement userDataLightBox_usernameField;
	public WebElement usernameTextField()
	{
		return userDataLightBox_usernameField;
	}
	
	//To create WebElement To write in Password text field
	private WebElement password;
	public WebElement passwordTextField()
	{
		return password;
	}
	
	//To create WebElement To write in Password text field
	private WebElement passwordCopy;
	public WebElement passwordCopyTextField()
	{
		return passwordCopy;
	}
	
	//To create WebElement to click on Create User
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement createUser;
	public WebElement clickOnCreateUser()
	{
		return createUser;
	}
	
	//To create WebElement to click on User1
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")
	private WebElement clickcreatedUser;
	public WebElement clickOnCreatedUser()
	{
		return clickcreatedUser;
	}
	
	//To create WebElement To click on Delete User
	private WebElement userDataLightBox_deleteBtn;
	public WebElement clickOnDeleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//To create WebElement to click on Save Changes
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement clickSaveChanges;
	public WebElement clickOnSaveChanges()
	{
		return clickSaveChanges;
	}
	
	//To create WebElement to click on TASKS
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement clicktasks;
	public WebElement clickOnTasks()
	{
		return clicktasks;
	}

	//To create WebElement to click on +Add New
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addnewtask;
	public WebElement clickOnAddNew()
	{
		return addnewtask;
	}
	
	//To create WebElement to click on Create New Customer
	@FindBy(className="createNewCustomer")
	private WebElement createnewcustomer;
	public WebElement createNewCustomer()
	{
		return createnewcustomer;
	}
	
	//To create WebElement To click on Enter Customer Name
	private WebElement customerLightBox_nameField;
	public WebElement EnterCustomerNameTextField()
	{
		return customerLightBox_nameField;
	}
	
	//To create WebElement to click on +Create Customer Button
	@FindBy(xpath="//*[@id='customerLightBox_commitBtn']/div/span")
	private WebElement createcustomer;
	public WebElement createCustomerButton()
	{
		return createcustomer;
	}
	
	//To create WebElement to click on To View Customer Settings
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customersettings;
	public WebElement CustomerSettings()
	{
		return customersettings;
	}
	
	//To create WebElement to click on ACTIONS w.r.t Customer
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement clickactions;
	public WebElement clickOnActionsCustomer()
	{
		return clickactions;
	}
	
	//To create WebElement to click on Delete Customer
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecustomer;
	public WebElement deleteCustomer()
	{
		return deletecustomer;
	}
	
	//To create WebElement to click on Delete Customer Permanently
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement deleteCustomerPermanently()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	//To create WebElement to click on Customer Description
	@FindBy(className="textarea")
	private WebElement customerdescription;
	public WebElement CustomerDescription()
	{
		return customerdescription;
	}
	
	//To create WebElement to click on Cross Mark in Customer Settings
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[1]")
	private WebElement crossmarkcustomer;
	public WebElement CrossMarkCustomer()
	{
		return crossmarkcustomer;
	}
	
	//To create WebElement to click on Create New Project
	@FindBy(className="createNewProject")
	private WebElement createnewproject;
	public WebElement createNewProject()
	{
		return createnewproject;
	}
	
	//To create WebElement to click on Enter Project Name
	private WebElement projectPopup_projectNameField;
	public WebElement enterProjectNameTextField()
	{
		return projectPopup_projectNameField;
	}
	
	//To create WebElement to click on +Create Project Button
	@FindBy(xpath="//*[@id='projectPopup_commitBtn']/div")
	private WebElement createprojectbutton;
	public WebElement createProjectButton()
	{
		return createprojectbutton;
	}
	
	//To create WebElement to click on Project Settings
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projectsettings;
	public WebElement projectSettings()
	{
		return projectsettings;
	}
	
	//To create WebElement to click on ACTIONS w.r.t Project
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement clickactionsproject;
	public WebElement clickOnActionsProject()
	{
		return clickactionsproject;
	}
	
	//To create WebElement to click on Delete Project
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
	private WebElement deleteproject;
	public WebElement DeleteProject()
	{
		return deleteproject;
	}
	
	//To create WebElement to click on Delete Project Permanently
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement deleteProjectPermanently()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	//To create WebElement to click on Project Description
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement projectdescription;
	public WebElement ProjectDescription()
	{
		return projectdescription;
	}
	
	//To create WebElement to click on Cross Mark in Project Settings
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
	private WebElement crossmarkproject;
	public WebElement CrossMarkProject()
	{
		return crossmarkproject;
	}
	
	//To create WebElement to click on +Add New Tasks
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement addnewtasks;
	public WebElement clickOnAddNewTasks()
	{
		return addnewtasks;
	}
	
	//To create WebElement to click on Create New Tasks
	@FindBy(className="createNewTask")
	private WebElement createnewtasks;
	public WebElement clickOnCreateNewTasks()
	{
		return createnewtasks;
	}
	
	//To create WebElement to click on +Enter Task Name in 1st row
	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
	private WebElement entertask1;
	public WebElement enterTask1TextField()
	{
		return entertask1;
	}
	
	//To create WebElement to click on +Enter Task Name in 2nd row
	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[2]/td[1]/input")
	private WebElement entertask2;
	public WebElement enterTask2TextField()
	{
		return entertask2;
	}
	
	//To create WebElement to click on +Enter Task Name in 3rd row
	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[3]/td[1]/input")
	private WebElement entertask3;
	public WebElement enterTask3TextField()
	{
		return entertask3;
	}
	
	//To create WebElement to click on +Enter Task Name in 4th row
	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[4]/td[1]/input")
	private WebElement entertask4;
	public WebElement enterTask4TextField()
	{
		return entertask4;
	}
	
	//To create WebElement to click on +Enter Task Name in 5th row
	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[5]/td[1]/input")
	private WebElement entertask5;
	public WebElement enterTask5TextField()
	{
		return entertask5;
	}
	
	//To create WebElement to click on +Create Tasks Button
	@FindBy(xpath="//*[@id='createTasksPopup_commitBtn']/div/span")
	private WebElement createtasksbutton;
	public WebElement createTasksButton()
	{
		return createtasksbutton;
	}
	
	//To create WebElement to click on 1st task check box
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[1]/div/div")
	private WebElement chechbox1;
	public WebElement Task1Checkbox()
	{
		return chechbox1;
	}
	
	//To create WebElement to click on 2nd task check box
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[2]/td[1]/div/div")
	private WebElement chechbox2;
	public WebElement Task2Checkbox()
	{
		return chechbox2;
	}
	
	//To create WebElement to click on 3rd task check box
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[3]/td[1]/div/div")
	private WebElement chechbox3;
	public WebElement Task3Checkbox()
	{
		return chechbox3;
	}
	
	//To create WebElement to click on 4th task check box
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[4]/td[1]/div/div")
	private WebElement chechbox4;
	public WebElement Task4Checkbox()
	{
		return chechbox4;
	}
	
	//To create WebElement to click on 5th task check box
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[5]/td[1]/div/div")
	private WebElement chechbox5;
	public WebElement Task5Checkbox()
	{
		return chechbox5;
	}
	
	//To create WebElement to click on Delete tasks
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[3]/div/div/div[4]/span")
	private WebElement deletetasks;
	public WebElement DeleteTask()
	{
		return deletetasks;
	}
	
	//To create WebElement to click on Delete tasks Permanently
	private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
	public WebElement deleteTaskPermanently()
	{
		return deleteTaskPopup_deleteConfirm_submitTitle;
	}
	
	//To create WebElement to click on Start Exploring actiTime
	@FindBy(className="startExploringText")
	private WebElement strtExplorActiTime;
	public WebElement startExploringActiTime()
	{
		return strtExplorActiTime;
	}
	
	//To create WebElement to click on User3
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table")
	private WebElement clickcreatedUser3;
	public WebElement clickOnCreatedUser3()
	{
		return clickcreatedUser3;
	}
	//To create WebElement to click on User2
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table")
	private WebElement clickcreatedUser2;
	public WebElement clickOnCreatedUser2()
	{
		return clickcreatedUser2;
	}
}
