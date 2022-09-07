package com.xworkz.pub.PubRule;

public class CustomerPubRule implements PubRule{

	@Override
	public boolean dressCodefollowed() {
		System.out.println("running dressCodefollowed");
		return true;
	}

	@Override
	public int age() {
		System.out.println("running age");
		return 22	;
	}

	@Override
	public boolean validProof() {
		System.out.println("running validProof");
		return true;
	}

}
