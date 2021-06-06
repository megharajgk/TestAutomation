package com.sgtesting.testscripts;

import org.apache.log4j.Logger;

public class ForLoopDemo {
	public static Logger log=Logger.getLogger("For Loop Output");
	public static void main(String[] args) {
		log.info("The Execution of For Loop Starts Here!!!!!");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0) {
				log.info("The Even Number is :"+i);
			}
		}
		log.info("The Execution of For Loop ends Here!!!!!");

	}

}
