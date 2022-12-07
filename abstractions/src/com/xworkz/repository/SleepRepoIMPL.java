package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.SleepDTO;

@Pankaj
public class SleepRepoIMPL implements SleepRepo {

	@Override
	public boolean save(SleepDTO dto) {
		System.out.println("SleepDTO saving");
		return false;
	}

}
