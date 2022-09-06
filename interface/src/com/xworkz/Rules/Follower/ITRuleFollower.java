package com.xworkz.Rules.Follower;

import com.xworkz.MakeRules.HRRules;
import com.xworkz.MakeRules.ManagerRules;
import com.xworkz.MakeRules.SecurityRules;

public class ITRuleFollower implements HRRules, ManagerRules, SecurityRules {

	@Override
	public boolean swipeCard() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean parkingApproval() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean informLeave() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean wfh() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean applyLeaves() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean harrasment() {
		// TODO Auto-generated method stub
		return false;
	}

}
