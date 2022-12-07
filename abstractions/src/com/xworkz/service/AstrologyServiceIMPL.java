package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.AstrologyDTO;
import com.xworkz.repository.AstrologyRepo;
@Pankaj
public class AstrologyServiceIMPL implements AstrologyService {
	@Autowired
	@Qualifier("astrologyRepo")
	private AstrologyRepo repo;

	@Override
	public boolean validateAndSave(AstrologyDTO dto) {
		System.out.println("AstrologyDTO saving after validation");
		repo.save(dto);
		return true;
	}

}
