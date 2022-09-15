package com.xworkz.daoImpl;

import com.xworkz.dao.AlcoholDAO;
import com.xworkz.dto.AlcoholDTO;

public class AlcoholDAOImpl implements AlcoholDAO {
	private AlcoholDTO[] alcohol = new AlcoholDTO[15];
	private int index = 0;

	@Override
	public boolean create(AlcoholDTO dto) {
		this.alcohol[index] = dto;
		index++;
		System.out.println("Alcohol saved" + dto + "index" + this.index);

		return false;
	}

}
