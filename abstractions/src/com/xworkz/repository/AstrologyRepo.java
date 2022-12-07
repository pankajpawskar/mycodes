package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.AstrologyDTO;
@Pankaj
public interface AstrologyRepo {
	boolean save(AstrologyDTO dto);
}
