package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.SleepDTO;

@Pankaj
public interface SleepRepo {
	boolean save(SleepDTO dto);
}
