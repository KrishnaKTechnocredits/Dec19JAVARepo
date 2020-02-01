package sonalPDec19.homeworkex;
/*
 * Print total debit and total credit transactions. 
 * Also print total debit and total credit transactions of each account holder.
 */

public class BankTransactions {
	String accName;
	int accNo;
	static int dTotalCount;
	static int cTotalCount;
	int debitCount;
	int creditCount;

	BankTransactions(String name, int id) {
		accName = name;
		accNo = id;
	}

	void debit() {
		dTotalCount++;
		debitCount++;
	}

	void credit() {
		cTotalCount++;
		creditCount++;
	}

	void display() {
		System.out.println("Debit transactions of " + accName + ": " + debitCount);
		System.out.println("Credit transactions of " + accName + ": " + creditCount);
	}

	public static void main(String[] args) {
		BankTransactions t1 = new BankTransactions("Sonal", 1);
		t1.debit();
		t1.debit();
		t1.credit();
		t1.display();
		BankTransactions t2 = new BankTransactions("Shekhar", 2);
		t2.debit();
		t2.credit();
		t2.credit();
		t2.display();
		BankTransactions t3 = new BankTransactions("Mrigank", 3);
		t3.debit();
		t3.debit();
		t3.display();
		System.out.println("Total debit transactions: " + dTotalCount);
		System.out.println("Total credit transactions: " + cTotalCount);
	}

}
