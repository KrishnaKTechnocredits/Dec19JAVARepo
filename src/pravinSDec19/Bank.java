package pravinSDec19;
/*
 * HomeWork for Constructor 25 Jan 2020
 * 
 * 	Bank class
	credit method
	debit method
	
	account number should be initialized
	
	Find how many account objects 
	Find how many times credit and debit called
		Total credit and debit
		Individually credit and debit
 * 
 *  
 */
public class Bank {

	int accountNum;
	static int totalCreditCount = 0;
	static int totalDebitCount = 0;
	static int totalAccountObjectCount = 0;
	int indCreditCount = 0;
	int indDebitCount = 0;

	Bank(int accountNumber) {

		accountNum = accountNumber;
		totalAccountObjectCount++;

	}

	void debit() {

		totalDebitCount++;
		indDebitCount++;

	}

	void credit() {

		totalCreditCount++;
		indCreditCount++;

	}

	static void displayClassLevelInfo() {

		System.out.println("Total number of objects created for Bank class are " + totalAccountObjectCount);
		System.out.println("Total number of called Debit methods are " + totalDebitCount);
		System.out.println("Total number of called Credit methods are " + totalCreditCount);

	}

	void displayObjectLevelInfo(String objectName) {

		System.out.println(objectName+ " individually called debit methods are " + indDebitCount);
		System.out.println(objectName+ " individually called credit methods are " + indCreditCount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1 = new Bank(101);
		Bank b2 = new Bank(102);
		Bank b3 = new Bank(103);
		Bank b4 = new Bank(104);
		b1.credit();
		b1.debit();
		b1.credit();
		
		b2.credit();
		b2.debit();
		
		b3.credit();
		b3.debit();
		
		b4.credit();
		b4.credit();
		b4.debit();
		
		displayClassLevelInfo();
		b1.displayObjectLevelInfo("b1");
		b2.displayObjectLevelInfo("b2");
		b3.displayObjectLevelInfo("b3");
		b4.displayObjectLevelInfo("b4");

	}

}
