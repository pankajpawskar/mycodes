package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.WeatherDTO;

@Pankaj
public class WeatherRepoIMPL implements WeatherRepo {

	@Override
	public boolean save(WeatherDTO dto) {
		System.out.println("WeatherDTO saving");
		return true;
	}

}
