package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.UfcDTO;

@Pankaj
public class UfcRepoIMPL implements UfcRepo {

	@Override
	public boolean save(UfcDTO dto) {
		System.out.println("UfcDTO saving");
		return false;
	}

}
