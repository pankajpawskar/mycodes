package com.xworkz.service;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.AstrologyDTO;
@Pankaj
public interface AstrologyService {
	boolean validateAndSave(AstrologyDTO dto);
}