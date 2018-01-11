package com.java.design.bridge.pattern;

import com.java.design.bridge.pattern.abstracts.Car;
import com.java.design.bridge.pattern.interfaces.Product;

/**
 * refined abstraction, here this is a car company
 */
public class BigWheel extends Car {

	private final Product product;
	private final String carType;
	
	public BigWheel(Product product, String carType) {
		super(product, carType); //ensures that this object is constructed as a car.
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
