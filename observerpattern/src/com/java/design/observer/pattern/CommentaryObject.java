package com.java.design.observer.pattern;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {

	private final List<Observer> observers;
	private String desc;
	private final String subjectDetails;
	
	public CommentaryObject(List<Observer> observers, String subjectDetails) {
		this.observers = observers;
		this.subjectDetails = subjectDetails;
		
	}
	
	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers();
	}

	@Override
	public void subscribeObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		//always remove the index of the object and not the object
		observers.remove(observers.indexOf(observer));

	}

	@Override
	public void notifyObservers() {
		System.out.println();
		for(Observer observer : observers){
		observer.update(desc);
		}

	}

	@Override
	public String subjectDetails() {
		return subjectDetails;
	}

}
