package com.java.design.singleton.pattern.serializable;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * The following example shows how you can protect your class from getting instantiated more than once
 *
 */
public class Singleton implements Serializable {
	
		private static final long serialVersionUID = -1093810940935189395L;
		
		private static Singleton sc = new Singleton();
		
		//ensures that sc is never null, since we're already instantiating it 
		private Singleton(){
	        //
			if(sc!=null){
				throw new IllegalStateException("Already created.");
				}
		}
		
		
	
		public static Singleton getInstance(){
			return sc;
		}
		
		
		private Object readResolve() throws ObjectStreamException{
			return sc;
		}
		
		private Object writeReplace() throws ObjectStreamException{
			return sc;
		}
		
		//ensures that this singleton is never cloned throughout the application 
		public Object clone() throws CloneNotSupportedException{
			throw new CloneNotSupportedException("Singleton, cannot be clonned");
		}
		
		/*
		 * To prevent the singleton getting instantiated from different class loaders, you can implement the getClass() method. The
		 * above getClass() method associates the classloader with the current thread; if that classloader is null, the method uses the
		 * same classloader that loaded the singleton class.
		 */
		@SuppressWarnings("unused")
		private static Class<?> getClass(String classname) throws ClassNotFoundException {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			
			if(classLoader == null)
				classLoader = Singleton.class.getClassLoader();
			
			return classLoader.loadClass(classname);
		}
}