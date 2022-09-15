package com.xworkz.exception.serviceImpl;

import com.xworkz.exception.checkedexception.TouristPlaceValidException;
import com.xworkz.exception.doa.TouristPlaceDAO;
import com.xworkz.exception.service.TouristPlaceService;

public class TouristPlaceServiceImpl implements TouristPlaceService {

	private TouristPlaceDAO touristPlaceDAO;

	public TouristPlaceServiceImpl(TouristPlaceDAO touristPlaceDAO) {
		this.touristPlaceDAO = touristPlaceDAO;
	}

	@Override
	public boolean checkAndValidate(String place) throws TouristPlaceValidException {
		if (place != null && place.length() > 0 && place.length() < 10) {
			if (this.touristPlaceDAO.checkName(place)) {
				System.out.println("place name is present");
				throw new TouristPlaceValidException("valid");

			} else {
				System.err.println("Place name is not present");
				this.touristPlaceDAO.save(place);
				return true;
			}

		} else {
			System.err.println("place is not present");
			throw new TouristPlaceValidException("not valid");
		}
	}

}