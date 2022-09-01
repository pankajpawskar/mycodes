package com.xworkz.abstraction.rider;

import com.xworkz.abstraction.sub.PrepaidSimcard;
import com.xworkz.abstraction.base.Simcard;
import com.xworkz.abstraction.sub.PostpaidSimcard;

public class SimcardRider {

	public static void main(String[] args) {
		
		Simcard sc;
		
		sc=new PrepaidSimcard();
		sc.payment();
		sc.duration();
		sc.calls();
		sc.message();
		
		sc=new PostpaidSimcard();
	    sc.payment();
		sc.duration();
		sc.calls();
		sc.message();
		}
}