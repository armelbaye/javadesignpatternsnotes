package com.java.design.singleton.pattern.lazy;

import com.java.design.singleton.pattern.lazy.SingletonLazy;

public class TestSingletonLazy {

	public static void main(String [] args) {
		/* 
		 * cannot instantiate the SingletonEager class as below
		 */
		//SingletonEager sc = new SingletonEager();
	
		//we can only access the static object from the getInstance method
		SingletonLazy sc = SingletonLazy.getInstance();
		double result = sc.add(2, 3);
		System.out.println(result);
	}

}
