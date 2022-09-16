package com.xworkz.exception.daoImpl;

import com.xworkz.exception.doa.PrimeMinisterDAO;
import com.xworkz.exception.uncheckedexception.UnCheckedException;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {

	private String[] dataStore = new String[6];
	private int index;

	@Override
	public boolean save(String name) throws UnCheckedException {
		this.dataStore[index] = name;
		System.out.println("name = " + name + " " + "Index:" + this.index);
		this.index++;
		return true;
	}

	@Override
	public boolean checkName(String name) {
		for (String ref : this.dataStore)
			if (ref != null && ref.equals(name)) {
				System.out.println("Name is not null");
				return true;
			}

		return false;
	}

}