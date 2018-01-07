package com.java.design.observer.pattern;

import java.util.ArrayList;

public class TestObserverPattern {

	
	
	public static void main(String[] args) {
		
		
		Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer - Match [2014AUG24]");
		
		//first observer
		Observer observer = new SmsUsers(subject, "Adam Warner [New York]");
		observer.subscribe();
		
		System.out.println();
		
		//second observer
		Observer observer2 = new SmsUsers(subject, "Tim Ronney [London]");
		observer2.subscribe();
		
		//commentary being publised to the subscribers
		Commentary cObject = ((Commentary)subject);
		
		//first set of updates
		cObject.setDesc("Welcome to live Soccer match");
		cObject.setDesc("Current score 0-0");
		
		System.out.println();
		
		observer2.unSubscribe();
		
		System.out.println();
		
		//second set of updates
		cObject.setDesc("It’s a goal!!");
		cObject.setDesc("Current score 1-0");
		
		System.out.println();
		
		Observer observer3 = new SmsUsers(subject, "Marrie [Paris]");
		observer3.subscribe();
		
		System.out.println();
		
		//third set of updates
		cObject.setDesc("It’s another goal!!");
		cObject.setDesc("Half-time score 2-0");
		
	 }
		
	}
	
