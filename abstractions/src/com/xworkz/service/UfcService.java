package com.xworkz.service;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.UfcDTO;
@Pankaj
public interface UfcService {
	boolean validateAndSave(UfcDTO dto);

}
