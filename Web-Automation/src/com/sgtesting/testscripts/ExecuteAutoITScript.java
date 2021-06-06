package com.sgtesting.testscripts;

public class ExecuteAutoITScript {

	public static void main(String[] args) {
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("F:/AutoIT/DemoTestScriptFina.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
