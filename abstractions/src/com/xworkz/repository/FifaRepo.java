package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.FifaDTO;
@Pankaj
public interface FifaRepo {
	boolean save(FifaDTO dto);
}
