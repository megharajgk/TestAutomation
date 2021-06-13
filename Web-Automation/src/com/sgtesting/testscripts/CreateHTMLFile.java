package com.sgtesting.testscripts;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateHTMLFile {

	public static void main(String[] args) {
		createHTMLFileDemo();

	}
	
	static void createHTMLFileDemo()
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter("F:\\HTML\\Reports\\Test.html"));
			bw.write("<html>");
			bw.write("<head><title>Test Web Page</title></head>");
			bw.write("<body>");
			bw.write("<h1 align=center>Sample Web Page</h1>");
			bw.write("<p>Java is a programming language,It is used for devlopment...</p>");
			bw.write("<p>Python is a Scripting language,It is used for devlopment...</p>");
			bw.write("</body>");
			bw.write("</html>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
