package com.xworkz.exception.service;

import com.xworkz.exception.checkedexception.TouristPlaceValidException;

public interface TouristPlaceService {
	boolean checkAndValidate(String place) throws  TouristPlaceValidException;

}
