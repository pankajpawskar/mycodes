package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.FifaDTO;

@Pankaj
public class FifaRepoIMPL implements FifaRepo {

	@Override
	public boolean save(FifaDTO dto) {
		System.out.println("FifaDTO saving");
		return true;
	}

}
