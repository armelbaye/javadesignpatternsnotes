package com.java.design.bridge.pattern.abstracts;

import com.java.design.bridge.pattern.interfaces.Product;

/**
 * abstraction concrete implementer, extended by each car type, contains abstract method that can be overriden by 
 * each car type.  
 */
public abstract class Car {

	/*
	 * this is our bridge, the Product interface is encapsulated in the car class, so that we
	 * know which product belongs to which car.
	*/
	private final Product product;
	
	//defines the car type being created.
	private final String carType;
	
	public Car(Product product,String carType){
	this.product = product;
	this.carType = carType;
	}
	
	public abstract void assemble();
	public abstract void produceProduct();
	
	// prints details of each car and their specific product name.
	public void printDetails(){
	System.out.println("Car: "+carType+", Product:"+product.productName());
	}
}
