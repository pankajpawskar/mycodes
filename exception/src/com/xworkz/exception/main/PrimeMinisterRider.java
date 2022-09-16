package com.xworkz.exception.main;

import com.xworkz.exception.checkedexception.CheckedException;
import com.xworkz.exception.daoImpl.PrimeMinisterDAOImpl;
import com.xworkz.exception.doa.PrimeMinisterDAO;
import com.xworkz.exception.service.PrimeMinisterService;
import com.xworkz.exception.serviceImpl.PrimeMinisterServiceImpl;
import com.xworkz.exception.uncheckedexception.UnCheckedException;

public class PrimeMinisterRider {

	public static void main(String[] args) {
		PrimeMinisterDAO dao = new PrimeMinisterDAOImpl();

		PrimeMinisterService service = new PrimeMinisterServiceImpl(dao);
		try {
			service.validateAndSave("Narendra Modi");
			service.validateAndSave("Lal Bahadur Shastri ");
			service.validateAndSave("H D Devegowda");
			service.validateAndSave("Atal Bihari Vajpayee");
			service.validateAndSave("Chandra Shekar");
			service.validateAndSave("Gulzarilal Nanda ");

		} catch (CheckedException check) {

			System.out.println(check.getMessage());

		} catch (UnCheckedException unc) {

			System.out.println(unc.getMessage());
		}

	}

}
