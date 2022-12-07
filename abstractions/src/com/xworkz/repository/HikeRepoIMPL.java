package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.HikeDTO;

@Pankaj
public class HikeRepoIMPL implements HikeRepo {

	@Override
	public boolean save(HikeDTO dto) {
		System.out.println("HikeDTO saving");
		return false;
	}

}
