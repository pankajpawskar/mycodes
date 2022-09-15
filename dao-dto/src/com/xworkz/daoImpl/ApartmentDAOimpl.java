package com.xworkz.daoImpl;

import com.xworkz.dao.ApartmentDAO;
import com.xworkz.dto.ApartmentDTO;

public class ApartmentDAOimpl implements ApartmentDAO {
	private ApartmentDTO[] apartment = new ApartmentDTO[15];
	private int index = 0;

	@Override
	public boolean create(ApartmentDTO dto) {
		this.apartment[index] = dto;
		index++;
		System.out.println("apartment saved" + dto + "index" + this.index);

		return false;
	}

}
