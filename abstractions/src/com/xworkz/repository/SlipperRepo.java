package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.SlipperDTO;

@Pankaj
public interface SlipperRepo {

	boolean save(SlipperDTO dto);

}
