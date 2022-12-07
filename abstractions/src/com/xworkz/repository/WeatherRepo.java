package com.xworkz.repository;

import com.xworkz.dtos.WeatherDTO;

public interface WeatherRepo {
	boolean save(WeatherDTO dto);

}
