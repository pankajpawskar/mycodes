package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.AdobeDTO;
import com.xworkz.repository.AdobeRepo;

@Pankaj
public class AdobeServiceIMPL implements AdobeService {
	@Autowired
	@Qualifier("adobeRepo")
	AdobeRepo repo;

	@Override
	public boolean validateAndSave(AdobeDTO dto) {
		System.out.println("Saving after validation");
		repo.save(dto);
		return false;
	}

}
