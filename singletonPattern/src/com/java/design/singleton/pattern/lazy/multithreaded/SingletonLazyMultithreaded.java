package com.java.design.singleton.pattern.lazy.multithreaded;

public class SingletonLazyMultithreaded {
	
	private static SingletonLazyMultithreaded sc_multiThreaded = null;
	
	private SingletonLazyMultithreaded(){}
	
	/*
	 * the sychronized keyword ensures that in a multithreaded environment two sc_multiThreaded object aren't created, which 
	 * can cause some inconsistencies, especially if we're only wanting the creating of singleton object.
	 */
	public static synchronized SingletonLazyMultithreaded getInstance(){
		if(sc_multiThreaded == null){
			sc_multiThreaded = new SingletonLazyMultithreaded();
			}
			return sc_multiThreaded;
		}

}
