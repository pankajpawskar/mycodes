package com.xworkz.hindu.rules;

public class PankajHinduRule implements HinduRule{

	@Override
	public boolean ahimsa() {
		System.out.println("running Non-violence");
		return true;
	}

	@Override
	public boolean speakTruth() {
		System.out.println("running speaking Truth");
		return true;
	}

	@Override
	public int noOfmarriage() {
		System.out.println("running Num of marriage is 1");
		return 1;
	}

}
