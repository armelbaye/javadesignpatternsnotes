package com.java.design.facade.pattern;

/**
 this creates a pipeline to all of the methods that start and stop the server
 prior to this approach every client would have to run every methods of the server individually,
 we've consolidated the start up and shutdown methods in this facade so that the implementing classes 
 don't need to have any knowledge of what the individual methods are.
 
 */

public class ScheduleServerFacade {
	
		private final ScheduleServer scheduleServer;
		
		public ScheduleServerFacade(ScheduleServer scheduleServer){
		this.scheduleServer = scheduleServer;
		}
		
		public void startServer(){
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
		}
		
		public void stopServer(){
		scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
		}

}
