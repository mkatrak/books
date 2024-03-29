package com.javapapers.designpattern.bridge;

public class Bike extends Vehicle {

	public Bike(final Workshop workShop1,
final  Workshop workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		workShop1.work();
		workShop2.work();
	}

}
