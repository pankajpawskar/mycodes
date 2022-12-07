package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.AliensDTO;
import com.xworkz.repository.AliensRepo;

@Pankaj
public class AliensServiceIMPL implements AliensService {
	@Autowired
	@Qualifier("aliensRepo")
	AliensRepo repo;

	@Override
	public boolean validateAndSave(AliensDTO dto) {
		System.out.println("AliensDTO saving after validation");
		repo.save(dto);
		return false;
	}

}
