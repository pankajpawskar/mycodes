package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.AdobeDTO;

@Pankaj
public class AdobeRepoIMPL implements AdobeRepo {

	@Override
	public boolean save(AdobeDTO dto) {
		System.out.println("Saved");
		return false;
	}

}
