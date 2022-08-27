package com.xworkz.encapsulationprojects.base;

public class Fish {
	private String name;
	private String type;

	public Fish() {
		System.out.println("defalt fish constroctor");
	}

	public Fish(String name, String type) {
		System.out.println("str,str constroctor");

		this.name = name;
		this.type = type;
	}

	public String getname() {
		return this.name = name;
	}

	public String gettype() {
		return this.type = type;
	}

	@Override

	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not Null");
			if (obj instanceof Fish) {
				System.out.println("Object is Type of Fish");
				Fish converted = (Fish) obj;
				String b1 = converted.name;
				String b2 = converted.type;
				if (this.name.equals(b1) && this.type.equals(b2)) {
					System.out.println("Both are same");
					return true;
				}

			} else {
				System.err.println("Object is not Type of Fish");
			}
		} else {
			System.err.println("Object is Null");
		}
		return super.equals(obj);
	}

}
