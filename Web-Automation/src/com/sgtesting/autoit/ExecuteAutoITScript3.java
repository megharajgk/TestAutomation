package com.sgtesting.autoit;

public class ExecuteAutoITScript3 {

	public static void main(String[] args) 
	{
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:/AutoIT/Test3.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
