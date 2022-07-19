package prodaptoopsbasics;

public class SimpleInterest {
	static int SI;
	static int principal;
	static int rate;
	static int time;
	static int total_Amount;
	void simpleInterest(int principal,int rate,int time) {
	SI = ((principal*rate*time)/100);
	System.out.println("SimpleInterest =" + SI);
	total_Amount = principal + SI;
	System.out.println("Amount to be paid after Loan = " + total_Amount);
	}
	}


