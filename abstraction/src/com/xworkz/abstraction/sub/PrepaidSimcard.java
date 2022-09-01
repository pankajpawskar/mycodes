package com.xworkz.abstraction.sub;

import com.xworkz.abstraction.base.Simcard;

public class PrepaidSimcard extends Simcard {

	@Override
	public void payment() {

		System.out.println("pay before using");
	}

	public void duration() {
		System.out.println("duration depends on plan");
	}

	public void calls() {
		System.out.println("calls");
	}

	public void message() {
		System.out.println("message");

	}
}
