package com.xworkz.service;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.FifaDTO;
@Pankaj
public interface FifaService {
	boolean validateAndSave(FifaDTO dto);
}
