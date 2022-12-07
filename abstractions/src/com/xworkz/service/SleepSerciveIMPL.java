package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.SleepDTO;
import com.xworkz.repository.SleepRepo;
@Pankaj
public class SleepSerciveIMPL implements SleepSercive {
	@Autowired
	@Qualifier("sleepRepo")
	private SleepRepo repo;

	@Override
	public boolean validateAndSave(SleepDTO dto) {
		System.out.println("SleepDTO saving after validaton");
		repo.save(dto);
		return false;
	}

}
