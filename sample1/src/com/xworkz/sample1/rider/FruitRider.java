package com.xworkz.sample1.rider;

import com.xworkz.sample1.inheritance.base.Fruit;
import com.xworkz.sample1.inheritance.sub.MangoFruit;

public class FruitRider {

	public static void main(String[] args) {

		
		MangoFruit mangoFruit = new MangoFruit("Mango",250,"yellow",250,15,13.7);
		mangoFruit.torisu();

	
		System.out.println();
		Fruit fruit = new MangoFruit("Mango",250,"yellow");
		MangoFruit convertedFrompernt = (MangoFruit) fruit;
		convertedFrompernt.torisu();

		System.out.println();
		convertedFrompernt = new MangoFruit("Mango", 250,"yellow",250,15,13.7);
		convertedFrompernt.torisu();
			

	}

}
