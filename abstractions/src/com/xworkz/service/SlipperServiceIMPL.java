package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.SlipperDTO;
import com.xworkz.repository.SlipperRepo;
@Pankaj
public class SlipperServiceIMPL implements SlipperService {
	@Autowired
	@Qualifier("slipperRepo")
	private SlipperRepo repo;

	@Override
	public boolean validateAndSave(SlipperDTO dto) {
		System.out.println("SlipperDTO saving after validation");
		repo.save(dto);
		return false;
	}

}
