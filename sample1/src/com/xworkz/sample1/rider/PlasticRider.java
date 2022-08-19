package com.xworkz.sample1.rider;

import com.xworkz.sample1.inheritance.base.*;

import com.xworkz.sample1.inheritance.sub.*;

public class PlasticRider {

	public static void main(String[] args) {
		
		
		PipePlastic pipeplastic =new  PipePlastic( "Pipe",7.2, "WHITE", "Astral", 457, 1.2);
		pipeplastic.torisu();
		
		System.out.println();
		Plastic plastic= new PipePlastic("Pipe",7.2, "WHITE");
		PipePlastic convo=(PipePlastic)plastic;
		convo.torisu();
		
		System.out.println();
		convo=new  PipePlastic( "Pipe",7.2, "WHITE", "Astral", 457, 1.2);
		convo.torisu();
	
	}

}
