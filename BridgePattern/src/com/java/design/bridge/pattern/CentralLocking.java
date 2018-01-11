package com.java.design.bridge.pattern;

import com.java.design.bridge.pattern.interfaces.Product;

/**
 * concrete implementer, here this is the product for each car type.
 * 
*/
public class CentralLocking implements Product {

	private final String productName;
	
	public CentralLocking(String productName){
	this.productName = productName;
	}
	
	@Override
	public String productName() {
		return productName;
	}

	@Override
	public void produce() {
		System.out.println("Producing Central Locking System");
	}

}
