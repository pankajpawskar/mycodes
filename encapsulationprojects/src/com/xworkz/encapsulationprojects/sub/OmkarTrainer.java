package com.xworkz.encapsulationprojects.sub;

import com.xworkz.encapsulationprojects.base.Trainer;

public class OmkarTrainer extends Trainer {

	public OmkarTrainer() {
		System.out.println("Default constructor of OmkarTrainer");
	}

	public OmkarTrainer(String name, int exp, String specialization) {
		super(name, exp, specialization);

	}

	@Override
	public void training() {
		System.out.println("Omkarsir is nexet level trainer");
		super.training();
	}

	@Override
	public void conductInterview() {
		System.out.println(" He conducts interviews");
		super.conductInterview();
	}

	@Override
	public void coding() {
		System.out.println(" He got great coding skills");
		super.coding();
	}

}
