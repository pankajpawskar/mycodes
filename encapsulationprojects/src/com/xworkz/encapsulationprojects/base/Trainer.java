package com.xworkz.encapsulationprojects.base;

public class Trainer {
	protected String name;
	protected int exp;
	protected String specialization;

	protected Trainer() {
		System.out.println("Default constructor of Trainer");
	}


	protected Trainer(String name, int exp, String specialization) {
		this.name = name;
		this.exp = exp;
		this.specialization = specialization;
	}

	protected void training() {
		System.out.println("Conducting training");
	}

	protected void conductInterview() {
		System.out.println("Conducting interviews");
	}

	protected void coding() {
		System.out.println("Coding knowledge ");
	}

	public String getName() {
		System.out.println("Trainer name ");
		return "OmkarSir";
	}

	public int getExp() {
		System.out.println("No of experience");
		return 10;
	}

	public String getSpecialization() {
		System.out.println("specialization in");
		return "Java";
	}

}


