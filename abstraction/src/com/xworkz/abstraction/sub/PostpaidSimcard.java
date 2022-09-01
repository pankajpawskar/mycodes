package com.xworkz.abstraction.sub;

import com.xworkz.abstraction.base.Simcard;

public class PostpaidSimcard extends Simcard {

	@Override
	public void payment() {

		System.out.println("pay after using");
	}

	public void duration() {
		System.out.println("duration usually monthly, but can be longer");
	}
	public void calls() {
		System.out.println("calls");
	}
	public void message() {
		System.out.println("message");
	}

}