package com.java.design.bridge.pattern.abstracts;

import com.java.design.bridge.pattern.interfaces.Product;

/**
 * abstraction concrete implementer
 
 */
public abstract class Car {

	/*
	 * this is our bridge, the Product interface is encapsulated in the car class, so that we
	 * know which product belongs to which car.
	*/
	private final Product product;
	
	private final String carType;
	
	public Car(Product product,String carType){
	this.product = product;
	this.carType = carType;
	}
	
	public abstract void assemble();
	public abstract void produceProduct();
	
	public void printDetails(){
	System.out.println("Car: "+carType+", Product:"+product.productName());
	}
}
