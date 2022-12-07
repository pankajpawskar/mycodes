package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.UfcDTO;
import com.xworkz.repository.UfcRepo;
@Pankaj
public class UfcServiceIMPL implements UfcService {
	@Autowired
	@Qualifier("ufcRepo")
	private UfcRepo repo;

	@Override
	public boolean validateAndSave(UfcDTO dto) {
		System.out.println("UfcDTO saving after validation");
		repo.save(dto);
		return false;
	}

}
