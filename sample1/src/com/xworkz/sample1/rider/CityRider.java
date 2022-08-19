package com.xworkz.sample1.rider;

import com.xworkz.sample1.inheritance.base.City;

import com.xworkz.sample1.inheritance.sub.BangaloreCity;

public class CityRider {

	public static void main(String[] args) {

		BangaloreCity BangaloreCity = new BangaloreCity("Karnatka", 560001, true, 8443675, "BBMP", "KEMPE GOWDA");
		BangaloreCity.torisu();

		

		System.out.println();
		
		City city = new BangaloreCity("Karnatka", 560001, true);
		BangaloreCity convertedFromPernt = (BangaloreCity) city;
		convertedFromPernt.torisu();

		System.out.println();
		convertedFromPernt = new BangaloreCity("Karnatka", 560001, true, 8443675, "BBMP", "KEMPE GOWDA");
		convertedFromPernt.torisu();

	}

}
