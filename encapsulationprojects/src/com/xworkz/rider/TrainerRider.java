package com.xworkz.rider;

import com.xworkz.encapsulationprojects.base.Trainer;

import com.xworkz.encapsulationprojects.sub.OmkarTrainer;

public class TrainerRider {

	public static void main(String[] args) {

		OmkarTrainer omkar = new OmkarTrainer();
		omkar.training();
		omkar.conductInterview();
		omkar.coding();
		System.out.println(omkar.getName());
		System.out.println(omkar.getExp());
		System.out.println(omkar.getSpecialization());

		System.out.println("<------------------------->");

		Trainer trainer = new OmkarTrainer();
		System.out.println(trainer.getName());
		System.out.println(trainer.getExp());
		System.out.println(trainer.getSpecialization());
	}

}


