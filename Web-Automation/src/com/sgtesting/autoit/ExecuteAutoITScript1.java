package com.sgtesting.autoit;

public class ExecuteAutoITScript1 {

	public static void main(String[] args) 
	{
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:/AutoIT/Test1.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
