package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.AstrologyDTO;

@Pankaj
public class AstrologyRepoIMPL implements AstrologyRepo {

	@Override
	public boolean save(AstrologyDTO dto) {
		System.out.println("AstrologyDTO saving");
		return false;
	}

}
