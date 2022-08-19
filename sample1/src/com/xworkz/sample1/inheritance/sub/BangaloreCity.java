package com.xworkz.sample1.inheritance.sub;

import com.xworkz.sample1.inheritance.base.City;

public class BangaloreCity extends City {

	public int population;
	public String governmentType;
	public String founder;

	public BangaloreCity(String state, int pincodes, boolean metrometropolitan, int population, String governmentType,
			String founder) {
		super(state, pincodes, metrometropolitan);
		this.population = population;
		this.governmentType = governmentType;
		this.founder = founder;
	}

	public BangaloreCity(String state, int pincodes, boolean metrometropolitan) {
		super(state, pincodes, metrometropolitan);
	}

	public void torisu() {

		System.out.println(super.state);
		System.out.println(super.pincodes);
		System.out.println(super.metrometropolitan);
		System.out.println(this.population);
		System.out.println(this.governmentType);
		System.out.println(this.founder);

	}

}
