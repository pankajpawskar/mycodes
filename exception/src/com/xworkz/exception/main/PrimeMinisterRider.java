package com.xworkz.exception.main;

import com.xworkz.exception.daoImpl.PrimeMinisterDAOImpl;
import com.xworkz.exception.doa.PrimeMinisterDAO;
import com.xworkz.exception.service.PrimeMinisterService;
import com.xworkz.exception.serviceImpl.PrimeMinisterServiceImpl;

public class PrimeMinisterRider {

	public static void main(String[] args) {
		PrimeMinisterDAO dao = new PrimeMinisterDAOImpl();

		PrimeMinisterService service = new PrimeMinisterServiceImpl(dao);

		service.validateAndSave("Narendra Modi");
		service.validateAndSave("Lal Bahadur Shastri ");
		service.validateAndSave("Narendra Modi");
		service.validateAndSave("Atal Bihari Vajpayee");
		service.validateAndSave("Chandra Shekar");
		service.validateAndSave("Gulzarilal Nanda ");
	}
}
