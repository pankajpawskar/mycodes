package com.xworkz.sample1.inheritance.sub;

import com.xworkz.sample1.inheritance.base.Fruit;

public class MangoFruit extends Fruit {
	public int energy;
	public int carbohydrates;
	public double sugers;

	public MangoFruit(String fruitName, int price, String fruitColor, int energy, int carbohydrates, double sugers) {
		super(fruitName, price, fruitColor);
		this.energy = energy;
		this.carbohydrates = carbohydrates;
		this.sugers = sugers;
	}

	public MangoFruit(String fruitName, int price, String fruitColor) {
		super(fruitName, price, fruitColor);
	}

	public void torisu() {

		System.out.println(super.fruitName);
		System.out.println(super.price);
		System.out.println(super.fruitColor);
		System.out.println(this.energy);
		System.out.println(this.carbohydrates);
		System.out.println(this.sugers);
		
		
	}
	

	}
