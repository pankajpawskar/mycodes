package Rider;

import com.xworkz.Rules.Follower.*;
import com.xworkz.MakeRules.*;

public class FollowerRider {

	public static void main(String[] args) {

		Object object = new ITRuleFollower();
		if (object instanceof ITRuleFollower) {
			ITRuleFollower itr1 = (ITRuleFollower) object;
			System.out.println(itr1.applyLeaves());
			System.out.println(itr1.harrasment());
			System.out.println(itr1.parkingApproval());
			System.out.println(itr1.informLeave());
			System.out.println(itr1.swipeCard());
			System.out.println(itr1.wfh());
		}
		System.out.println("");
		HRRules hrRules = new ITRuleFollower();
		if (hrRules instanceof ITRuleFollower) {
			ITRuleFollower itr2 = (ITRuleFollower) hrRules;
			System.out.println(itr2.applyLeaves());
			System.out.println(itr2.harrasment());
			System.out.println(itr2.parkingApproval());
			System.out.println(itr2.informLeave());
			System.out.println(itr2.swipeCard());
			System.out.println(itr2.wfh());
		}
		System.out.println("");
		ManagerRules managerRules = new ITRuleFollower();
		if (managerRules instanceof ITRuleFollower) {
			ITRuleFollower itr3 = (ITRuleFollower) managerRules;
			System.out.println(itr3.applyLeaves());
			System.out.println(itr3.harrasment());
			System.out.println(itr3.parkingApproval());
			System.out.println(itr3.informLeave());
			System.out.println(itr3.swipeCard());
			System.out.println(itr3.wfh());
		}
		System.out.println("");
		SecurityRules securityRules = new ITRuleFollower();
		if (securityRules instanceof ITRuleFollower) {
			ITRuleFollower itr4 = (ITRuleFollower) securityRules;
			System.out.println(itr4.applyLeaves());
			System.out.println(itr4.harrasment());
			System.out.println(itr4.parkingApproval());
			System.out.println(itr4.informLeave());
			System.out.println(itr4.swipeCard());
			System.out.println(itr4.wfh());
		}
		System.out.println("");
		ITRuleFollower follower = new ITRuleFollower();
		if (follower instanceof ITRuleFollower) {
			ITRuleFollower itr = (ITRuleFollower) follower;
			System.out.println(itr.applyLeaves());
			System.out.println(itr.harrasment());
			System.out.println(itr.parkingApproval());
			System.out.println(itr.informLeave());
			System.out.println(itr.swipeCard());
			System.out.println(itr.wfh());
		}
 
	}

}