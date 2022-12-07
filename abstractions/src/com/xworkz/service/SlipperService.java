package com.xworkz.service;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.SlipperDTO;
@Pankaj
public interface SlipperService {
	boolean validateAndSave(SlipperDTO dto);

}
