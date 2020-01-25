package rohiniBDec19.GitTest1;

/*WAP for bank deposit and withdraw method
 * a.constr-->Act number
 * b.How many deposit and withdraw 
 * c.per person deposit and withdraw */

public class Constructor1 {
	String nameOfAcctHolder;
	long acctNumber;
	static long balance;
	long depositeAmt;
	long withdrawAmt;
	static int rdCount = 0, sdCount = 0, rwCount = 0, swCount = 0;

	public static void main(String[] args) {
		Constructor1 cons = new Constructor1("Rohini", 123545653, 50000, 1200, 6000);
		cons.deposite();// 1st deposit of Rohini
		cons.withdraw();// 1st withdraw
		cons.deposite();// 2nd deposit of Rohini
		System.out.println("Withdrawls of Rohini: " + rwCount);
		System.out.println("deposites of Rohini: " + rdCount);

		Constructor1 cons1 = new Constructor1("Suraj", 737264726, 800000, 4000, 7000);
		cons1.deposite();// 1st deposit of Suraj
		cons1.withdraw();// 1st withdraw of suraj
		cons1.withdraw();// 2nd withdraw of suraj
		System.out.println("Withdrawls of Suraj: " + swCount);
		System.out.println("deposites of Suraj: " + sdCount);
		System.out.println("Total transactions of Rohini and Suraj: " + (rwCount + rdCount + swCount + sdCount));
		System.out.println("Total Withdrawls of Rohini and Suraj: " + (rwCount + swCount));
		System.out.println("Total deposites of Rohini and Suraj: " + (rdCount + sdCount));

	}

	private void withdraw() {

		{
			if (balance > withdrawAmt) {
				balance = balance - withdrawAmt;
			} else
				System.out.println("Insufficient balance");
		}

		if (nameOfAcctHolder == "Rohini")
			rwCount++;
		else
			swCount++;

	}

	private void deposite() {
		balance = balance + depositeAmt;
		if (nameOfAcctHolder == "Rohini")
			rdCount++;
		else
			sdCount++;
	}

	public Constructor1(String name, long accNum, long bal, long deposite, long withdraw) {
		this.nameOfAcctHolder = name;
		this.acctNumber = accNum;
		this.balance = bal;
		this.depositeAmt = deposite;
		this.withdrawAmt = withdraw;

	}

}
