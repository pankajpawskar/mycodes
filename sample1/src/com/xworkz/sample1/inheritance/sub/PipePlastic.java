package com.xworkz.sample1.inheritance.sub;

import com.xworkz.sample1.inheritance.base.Plastic;

public class PipePlastic extends Plastic {
	String brandName;
	int price;
	double thickness;

	public PipePlastic(String product, double weight, String colour, String brandName, int price, double thickness) {
		super(product, weight, colour);
		this.brandName = brandName;
		this.price = price;
		this.thickness = thickness;
	}

	public PipePlastic(String product, double weight, String colour) {
		 super(product,weight,colour);
	}
	public void torisu() {
		
		System.out.println(super.product);
		System.out.println(super.weight);
		System.out.println(super.colour);
		System.out.println(this.brandName);
		System.out.println(this.price);
		System.out.println(this.thickness);
		
	}
}
