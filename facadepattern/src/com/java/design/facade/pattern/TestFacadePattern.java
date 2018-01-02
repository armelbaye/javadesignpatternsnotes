package com.java.design.facade.pattern;

public class TestFacadePattern {
	
	public static void main(String[] args) {
		ScheduleServer scheduleServer = new ScheduleServer();
		ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
		
		//start the server 
		facadeServer.startServer();
		System.out.println("Server started, you may proceed!!");
		
		//shut down the server
		facadeServer.stopServer();
		System.out.println("Serve shut down, thanks for your time!!");
	}
}