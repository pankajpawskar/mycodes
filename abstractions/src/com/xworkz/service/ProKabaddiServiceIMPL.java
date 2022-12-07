package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.ProKabaddiDTO;
import com.xworkz.repository.ProKabaddiRepo;
@Pankaj
public class ProKabaddiServiceIMPL implements ProKabaddiService {
	@Autowired
	@Qualifier("proKabaddiRepo")
	private ProKabaddiRepo repo;

	@Override
	public boolean validateAndSave(ProKabaddiDTO dto) {
		System.out.println("ProKabaddiDTO saving after validation");
		repo.save(dto);
		return false;
	}

}
