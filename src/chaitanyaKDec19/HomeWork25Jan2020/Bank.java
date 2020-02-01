package chaitanyaKDec19.HomeWork25Jan2020;

public class Bank {

	// Declaring instance variables
	static int totalDebitTrans = 0;
	static int totalCreditTrans = 0;
	static int objectCreationCount = 0;
	int perUserCreditTrans = 0;
	int perUserDebitTrans = 0;

	// Parameterized constructor
	Bank(int acNo) {
		objectCreationCount++;
	}

	// Method for Credit transactions
	void credit() {
		totalCreditTrans++;
		perUserCreditTrans++;
	}

	// Method of Debit transactions
	void debit() {
		totalDebitTrans++;
		perUserDebitTrans++;
	}

	// Display method to display total transaction count
	static void displayTotalTransCount() {

		System.out.println("The number of times object of class created: " + objectCreationCount);
		System.out.println("Total number of credit transactions among all customers are: " + totalCreditTrans);
		System.out.println("Total number of debit transactions among all customers are: " + totalDebitTrans);

	}

	// Display method to display Credit and Debit transactions per user
	void displayPerUserTransCount() {

		System.out.println("Total number of crdit trasanaction for current customer are: " + perUserCreditTrans);
		System.out.println("Total number of debit trasanaction for current customer are: " + perUserDebitTrans);

	}

	public static void main(String[] args) {

		// Passing value to parameterized constructor while creating new objects
		Bank bank1 = new Bank(99);
		Bank bank2 = new Bank(199);
		Bank bank3 = new Bank(299);
		Bank bank4 = new Bank(399);

		// For first customer, calling Credit and Debit methods
		bank1.credit();
		bank1.credit();
		bank1.debit();
		bank1.debit();
		bank1.displayPerUserTransCount();

		// For second customer, calling Credit and Debit methods
		bank2.debit();
		bank2.credit();
		bank2.credit();
		bank2.displayPerUserTransCount();

		// For third customer, calling Credit and Debit methods
		bank3.debit();
		bank3.credit();
		bank3.displayPerUserTransCount();

		// For fourth customer, calling Credit and Debit methods
		bank4.debit();
		bank4.credit();
		bank4.credit();
		bank4.displayPerUserTransCount();

		// Calling method to dislpay repective transactions
		displayTotalTransCount();

	}

}
