package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.WeatherDTO;
import com.xworkz.repository.WeatherRepo;
@Pankaj
public class WeatherServiceIMPL implements WeatherService {
	@Autowired
	@Qualifier("weatherRepo")
	private WeatherRepo repo;

	@Override
	public boolean validateAndSave(WeatherDTO dto) {
		System.out.println("WeatherDTO saving after validation");
		repo.save(dto);
		return false;
	}

}
