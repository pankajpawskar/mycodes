package com.xworkz.pub.PubUser;

import com.xworkz.pub.PubRule.PubRule;

public class DownTownPub {

	private PubRule rule;

	public DownTownPub(PubRule rule) {
		System.out.println("default const");
		this.rule = rule;
	}

	public void checkRules() {
		boolean dressCodefollowed = this.rule.dressCodefollowed();
		int age = this.rule.age();
		boolean validProof = this.rule.validProof();
		if(dressCodefollowed && age>21 && validProof) {
			System.out.println("Rule followed");
		}
		else {
				System.err.println("Rule not followed");
			}
			
		}
	
	}

