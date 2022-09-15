package com.xworkz.exception.doa;

public interface TouristPlaceDAO {
	boolean save(String name);

	boolean checkName(String place);

}
