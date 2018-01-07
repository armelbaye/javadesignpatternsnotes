package com.java.design.singleton.pattern.lazy.singletonlazydoublecheck;

/**
 * this avoids synchronized call everytime the getInstance method is called which can be a bit expensive,
 * therefore we check the nullability of the object and then call synchronize on the class 
 *
 *
 */

public class SingletonLazyDoubleCheck {

	//ensures that this isn't part of the cpu cache and needs to always be retrieve from memory (keeps it's value at all time)
	private volatile static SingletonLazyDoubleCheck sc = null;
	
	private SingletonLazyDoubleCheck(){}
	
	public static SingletonLazyDoubleCheck getInstance(){
		if(sc == null){
			//synchronize the class to ensure single accessibility at a time, at this point
			// we only sychronized the class once.
			synchronized(SingletonLazyDoubleCheck.class){
				//safety check to make sure sc is null, not really needed imo
				if(sc == null){
					sc = new SingletonLazyDoubleCheck();
				}
			}
		}
		return sc;
	}
}
