package com.xworkz.exception.serviceImpl;

import com.xworkz.exception.checkedexception.CheckedException;
import com.xworkz.exception.doa.PrimeMinisterDAO;
import com.xworkz.exception.service.PrimeMinisterService;

public class PrimeMinisterServiceImpl implements PrimeMinisterService {
	private PrimeMinisterDAO primeMinisterDAO;

	public PrimeMinisterServiceImpl(PrimeMinisterDAO primeMinisterDAO) {
		this.primeMinisterDAO = primeMinisterDAO;
	}

	@Override
	public boolean validateAndSave(String name) {
		if (name != null && name.length() > 4 && name.length() < 50) {
			System.out.println("Name is valid");
			this.primeMinisterDAO.checkName(name);
			boolean present = this.primeMinisterDAO.checkName(name);
			if (present) {
				System.err.println("name is already exist ");
			} else {
				System.out.println("name is Not already exist ");
				this.primeMinisterDAO.save(name);

			}
		} else {
			System.err.println("Not valid");

		}
		return true;
	}
}
