package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.FifaDTO;
import com.xworkz.repository.FifaRepo;
@Pankaj
public class FifaServiceIMPL implements FifaService {
	@Autowired
	@Qualifier("fifaRepo")
	private FifaRepo repo;

	@Override
	public boolean validateAndSave(FifaDTO dto) {
		System.out.println("FifaDTO saving after validation");
		repo.save(dto);
		return false;
	}

}
