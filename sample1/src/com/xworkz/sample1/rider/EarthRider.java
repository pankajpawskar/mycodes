package com.xworkz.sample1.rider;

import com.xworkz.sample1.inheritance.base.Planet;

import  com.xworkz.sample1.inheritance.sub.EarthPlanet;
public class EarthRider {

	public static void main(String[] args) {
		
		EarthPlanet planetEarth = new EarthPlanet("Milky Way", 6371, true, 8, "	Earth", "Blue");
		planetEarth.galaxy="Milky Way";
		planetEarth.radius=6371;
		planetEarth.habitant=true;
		planetEarth.population=8;
		planetEarth.planetName="Earth";
		planetEarth.color="Blue";
		planetEarth.torisu();

		

		System.out.println();
		Planet planet = new EarthPlanet("Milky Way", 6371, true);
		EarthPlanet convertedFromPernt = (EarthPlanet) planet;
		convertedFromPernt.torisu();

		System.out.println();
		convertedFromPernt = new EarthPlanet("Milky Way", 6371, true, 8, "	Earth", "Blue");
		convertedFromPernt.torisu();

	}

}
