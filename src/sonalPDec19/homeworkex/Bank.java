package sonalPDec19.homeworkex;
/*
 * Print total debit and total credit transactions. 
 * Also print total debit and total credit transactions of each account holder.
 */

public class Bank {

	String accName;
	int accNo;
	static int dTotalCount;
	static int cTotalCount;
	//int debitCount;
	//int creditCount;

	Bank(String name, int id) {
		accName = name;
		accNo = id;             
	}

	void transaction(int currentBal, int[] newBal) {
		int creditCount = 0;
		int debitCount = 0;
		for (int i = 0; i < newBal.length; i++) {
			if (newBal[i] > currentBal) {
				creditCount++;
				cTotalCount++;
			} else if (newBal[i] < currentBal) {
				debitCount++;
				dTotalCount++;
			}
			currentBal = newBal[i];
		}
		System.out.println("Account holder: " + accName);
		System.out.println("Debit transactions: " + debitCount);
		System.out.println("Credit transactions: " + creditCount);
	}

	public static void main(String[] args) {
		Bank t1 = new Bank("Sonal", 1);
		int[] sNewBalEntries = { 1000, 2000, 5000, 9000, 4000 }; //Balance checked for defined time interval.
		t1.transaction(5000, sNewBalEntries);

		Bank t2 = new Bank("Shekhar", 2);
		int[] shNewBalEntry = { 2000, 2000, 5500, 3500, 7000 }; //Balance checked for defined time interval.
		t2.transaction(3500, shNewBalEntry);

		Bank t3 = new Bank("Mrigank", 3);
		int[] mNewBalEntries = { 6000, 8000, 8000, 8000, 8000 }; //Balance checked for defined time interval.
		t3.transaction(6000, mNewBalEntries);

		System.out.println("Total debit transactions: " + dTotalCount);
		System.out.println("Total credit transactions: " + cTotalCount);
	}

}
