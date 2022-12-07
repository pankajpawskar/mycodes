package com.xworkz.service;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.SleepDTO;
@Pankaj
public interface SleepSercive {
	boolean validateAndSave(SleepDTO dto);

}
