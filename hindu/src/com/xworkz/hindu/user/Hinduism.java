package com.xworkz.hindu.user;

import com.xworkz.hindu.rules.HinduRule;

public class Hinduism {

	private HinduRule hinduRule;

	public Hinduism(HinduRule hinduRule) {
		System.out.println("Default const of Hinduism");
		this.hinduRule = hinduRule;
	}

	public void checktheRules() {
		boolean ahimsa=this.hinduRule.ahimsa();
		boolean speakTruth=this.hinduRule.speakTruth();
		int noOfmarriage=this.hinduRule.noOfmarriage();
		if(ahimsa && noOfmarriage<2 && speakTruth) {
			System.out.println("Rule followed");
		}
		else {
			System.err.println("Rule not followed");
		}
		
	}
}
