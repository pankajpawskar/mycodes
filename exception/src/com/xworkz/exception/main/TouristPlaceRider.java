package com.xworkz.exception.main;

import com.xworkz.exception.checkedexception.TouristPlaceValidException;
import com.xworkz.exception.daoImpl.TouristPlaceDAOImpl;
import com.xworkz.exception.doa.TouristPlaceDAO;
import com.xworkz.exception.service.TouristPlaceService;
import com.xworkz.exception.serviceImpl.TouristPlaceServiceImpl;

public class TouristPlaceRider {

	public static void main(String[] args) {

		TouristPlaceDAO touristPlace = new TouristPlaceDAOImpl();

		TouristPlaceService tps = new TouristPlaceServiceImpl(touristPlace);

		try {
			tps.checkAndValidate("Ladakh");
			tps.checkAndValidate("Manali");
			tps.checkAndValidate("");
			tps.checkAndValidate("Coorg ");
			tps.checkAndValidate("Andaman & Nicobar");
			tps.checkAndValidate("Lakshadweep");
			tps.checkAndValidate("Goa");
			tps.checkAndValidate("Darjeeling");
			tps.checkAndValidate("Shimla");
			tps.checkAndValidate("Jaipur");

		} catch (TouristPlaceValidException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getClass());

		}

	}

}