package com.xworkz.rider;

import com.xworkz.encapsulationprojects.base.Fish;

public class FishRider {

	public static void main(String[] args) {

		Fish fish = new Fish("Tiger Bomb", "Fresh water");

		System.out.println(fish);
		String ab1 = fish.getname();
		String ab2 = fish.gettype();
		System.out.println(ab1);
		System.out.println(ab2);

		Fish fish2 = new Fish("Tiger ", "Fresh water");

		boolean ju = fish.equals(fish2);
		System.out.println(ju);

	}

}