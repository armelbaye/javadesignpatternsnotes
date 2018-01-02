package com.java.design.facade.pattern;



public class ScheduleServer {
	
	public void startBooting() {
		MessageWrapper.printMessage("------------------------------------");
		MessageWrapper.printMessage("server is booting... booted!!");
	}
	
	public void readSystemConfigFile() {
		MessageWrapper.printMessage( "server is reading sys config files... files read!!");
	}
	
	public void init() {
		MessageWrapper.printMessage( "server has initialized!");
	}
	
	public void initializeContext() {
		MessageWrapper.printMessage( "server context initialized!");
	}
	
	public void initializeListeners() {
		MessageWrapper.printMessage( "server listeners initialized!!");
	}
	
	public void createSystemObjects() {
		MessageWrapper.printMessage( "system objects created!!");
		MessageWrapper.printMessage("------------------------------------");
	}
	
	public void releaseProcesses() {
		MessageWrapper.printMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		MessageWrapper.printMessage( "server processes released!");
	}
	
	public void destory() {
		MessageWrapper.printMessage( "server destroyed!!");
	}
	
	public void destroySystemObjects() {
		MessageWrapper.printMessage( "system objects destroyed!");
	}
	
	public void destoryListeners() {
		MessageWrapper.printMessage( "server listeners destroyed");
	}
	
	public void destoryContext() {
		MessageWrapper.printMessage( "server context destroyed!!");
	}
	

	public void shutdown() {
		MessageWrapper.printMessage( "Shut down!");
		MessageWrapper.printMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}
