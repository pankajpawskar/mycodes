package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.SlipperDTO;

@Pankaj
public class SlipperRepoImpl implements SlipperRepo {

	@Override
	public boolean save(SlipperDTO dto) {
		System.out.println("SlipperDTO saving");
		return true;
	}

}
