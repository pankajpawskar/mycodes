package com.xworkz.repository;

import com.xworkz.Annotation.Pankaj;
import com.xworkz.dtos.HikeDTO;
@Pankaj
public interface HikeRepo {
	boolean save(HikeDTO dto);
}
