package com.xworkz.exception.checkedexception;

public class TouristPlaceValidException extends Exception {

	public TouristPlaceValidException(String msg) {
		super(msg);
		System.out.println("Default TouristPlaceValidException Constructor");
	}

}