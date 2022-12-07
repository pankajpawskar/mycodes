package com.xworkz.service;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.WeatherDTO;
@Pankaj
public interface WeatherService {
	boolean validateAndSave(WeatherDTO dto);
}
