package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.HikeDTO;
import com.xworkz.repository.HikeRepo;
@Pankaj
public class HikeServiceIMPL implements HikeService {
	@Autowired
	@Qualifier("hikeRepo")
	private HikeRepo repo;

	@Override
	public boolean validateAndSave(HikeDTO dto) {
		System.out.println("HikeDTO saving after validation");
		repo.save(dto);
		return true;
	}

}
