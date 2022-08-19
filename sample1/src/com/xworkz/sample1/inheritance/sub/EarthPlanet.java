package com.xworkz.sample1.inheritance.sub;

import com.xworkz.sample1.inheritance.base.Planet;

public class EarthPlanet extends Planet {
	public int population;
	public String planetName;
	public String color;

	public EarthPlanet(String galaxy, int radius, boolean habitant, int population, String planetName, String color) {
		super(galaxy, radius, habitant);
		this.population = population;
		this.planetName = planetName;
		this.color = color;
	}

	public EarthPlanet(String galaxy, int radius, boolean habitant) {
		super(galaxy, radius, habitant);
	}

	public void torisu() {

		System.out.println(super.galaxy);
		System.out.println(super.radius);
		System.out.println(super.habitant);
		System.out.println(this.population);
		System.out.println(this.planetName);
		System.out.println(this.color);

	}

}
