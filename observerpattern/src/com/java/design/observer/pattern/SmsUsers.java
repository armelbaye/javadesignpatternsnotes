package com.java.design.observer.pattern;

public class SmsUsers implements Observer {
	
	private String desc;
	private String userInfo;
	private final Subject subject;
	
	public SmsUsers(Subject subject, String userInfo) {
		if(subject == null) {
			throw new IllegalArgumentException("No Publisher Found!!");
		}
		this.subject = subject;
		this.userInfo = userInfo;
	}

	@Override
	public void update(String desc) {
		this.desc = desc;
		display();

	}

	@Override
	public void subscribe() {
		System.out.println("Subscribing "+userInfo+" to "+subject.subjectDetails()+" ...");
		this.subject.subscribeObserver(this);
		System.out.println("Subscribed successfully.");
	}

	@Override
	public void unSubscribe() {
		System.out.println("Unsubscribing "+userInfo+" to "+subject.subjectDetails()+" ...");
		this.subject.unSubscribeObserver(this);
		System.out.println("Unsubscribed successfully.");

	}
	
	public void display() {
		System.out.println("["+userInfo+"]: "+desc);
	}

}
