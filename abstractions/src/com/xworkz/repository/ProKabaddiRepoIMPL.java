package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.ProKabaddiDTO;

@Pankaj
public class ProKabaddiRepoIMPL implements ProKabaddiRepo {

	@Override
	public boolean save(ProKabaddiDTO dto) {
		System.out.println("ProKabaddiDTO saving");
		return true;
	}

}
