package com.xworkz.hindu.user;

import com.xworkz.hindu.rules.HinduRule;
import com.xworkz.hindu.rules.PankajHinduRule;

public class HinduRider {

	public static void main(String[] args) {
		HinduRule hinduRule= new PankajHinduRule();
		
		Hinduism hinduism= new Hinduism(hinduRule);
		
		hinduism.checktheRules();
		

	}

	

}
