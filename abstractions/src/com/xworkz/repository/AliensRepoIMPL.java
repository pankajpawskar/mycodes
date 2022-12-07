package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.AliensDTO;
@Pankaj
public class AliensRepoIMPL implements AliensRepo {

	@Override
	public boolean save(AliensDTO dto) {
		System.out.println("AliensDTO saving");
		return true;
	}

}
