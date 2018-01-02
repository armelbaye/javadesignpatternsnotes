package com.java.design.bridge.pattern;

import com.java.design.bridge.pattern.interfaces.Product;

/**

 concrete implementer

*/
public class CentralLocking implements Product {

	private final String productName;
	
	public CentralLocking(String productName){
	this.productName = productName;
	}
	
	@Override
	public String productName() {
		// TODO Auto-generated method stub
		return productName;
	}

	@Override
	public void produce() {
		// TODO Auto-generated method stub
		System.out.println("Producing Central Locking System");
	}

}