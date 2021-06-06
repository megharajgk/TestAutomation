package com.sgtesting.autoit;

public class ExecuteAutoITScript2 {
	public static void main(String[] args) {
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:\\AutoIT\\Test2.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
