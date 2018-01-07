package com.java.design.singleton.pattern.eager;

public class SingletonEager {
	
		/*
		 * private to encapsulate the object, and only allow it to be retrieved via a method
		 * static to ensure that only one instance of the class is created.
		 * 
		 *  this is a bad approach because The one problem with this approach is that, 
		 *  the object would get created as soon as the class gets loaded into the JVM. 
		 *  If the object is never requested, there would be an object useless inside the memory.
		 *  
		 */
		private static SingletonEager sc = new SingletonEager();
	
		//private construction that insure that this class is only instantiated internally.
		private SingletonEager(){}
	
		// this allows the getInstance method to be called outside of the class and return the static class variable
		public static SingletonEager getInstance() { 
			return sc;		
		}
		
		public double add(int i, int z) {
			return i + z;
		}

}
