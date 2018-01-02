package com.java.design.bridge.pattern;

import com.java.design.bridge.pattern.abstracts.Car;
import com.java.design.bridge.pattern.interfaces.Product;

/**
 refined abstraction
 
 
 */
public class BigWheel extends Car {

	private final Product product;
	private final String carType;
	
	public BigWheel(Product product, String carType) {
		super(product, carType);
		this.product = product;
		this.carType = carType;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling "+product.productName()+" for "+carType);

	}

	@Override
	public void produceProduct() {
		product.produce();
		System.out.println("Modifing product: " +product.productName() +" according to" + carType);
	}

}
