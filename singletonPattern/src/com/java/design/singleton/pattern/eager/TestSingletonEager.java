package com.java.design.singleton.pattern.eager;

public class TestSingletonEager {
	
	public static void main(String [] args) {
		/* 
		 * cannot instantiate the SingletonEager class as below
		 */
		//SingletonEager sc = new SingletonEager();
	
		//we can only access the static object from the getInstance method
		SingletonEager sc = SingletonEager.getInstance();
		double result = sc.add(2, 3);
		System.out.println(result);
	}

}
