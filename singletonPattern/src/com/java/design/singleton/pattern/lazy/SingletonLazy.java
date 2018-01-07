package com.java.design.singleton.pattern.lazy;

public class SingletonLazy {

	/*
	 * the null value ensures that this doesn't use any memory space 
	 */
	private static SingletonLazy sc_lazy = null;
	
	//private construction that insure that this class is only instantiated internally.
	private SingletonLazy(){}

	/* this allows the getInstance method to be called outside of the class and return the static class variable 
	 * the null check ensure that we're not using a null object which can cause a NullPointerException,
	 * remember once this method is called the created object will last the entirety of the application lifecycle.
	 */
	
	public static SingletonLazy getInstance() { 
		if (sc_lazy == null) {
			sc_lazy = new SingletonLazy();
		}
		
		return sc_lazy ;		
	}
	
	public double add(int i, int z) {
		return i + z;
	}
}
