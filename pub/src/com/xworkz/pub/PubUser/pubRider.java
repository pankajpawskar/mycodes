package com.xworkz.pub.PubUser;

import com.xworkz.pub.PubRule.CustomerPubRule;
import com.xworkz.pub.PubRule.PubRule;

public class pubRider {

	public static void main(String[] args) {

		PubRule rule = new CustomerPubRule();

		DownTownPub downTownPub = new DownTownPub(rule);
		downTownPub.checkRules();
		
	}

}
