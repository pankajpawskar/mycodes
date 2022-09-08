package com.xworkz.dao;

public class LakeRider {

	public static void main(String[] args) {
		LakeDAOImpl impl = new LakeDAOImpl();
		impl.save("Ulsoor Lake ");
		impl.save("Kengeri Lake");
		impl.save("Agara Lake");
		impl.save("Lal Bagh Lake");
		impl.save("Madiwala Lake");
		impl.save("Kaikondrahalli Lake");
		impl.save("Nagavara Lake");
		impl.save("Varthur Lake");
		impl.save("Hebbal Lake");
		impl.save("Sankey Tank Lake");

		impl.printLakeaNames();
	}

}
