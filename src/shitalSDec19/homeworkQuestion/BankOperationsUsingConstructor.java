/* (i). Bank class contains 2 methods debit() and credit()
* (ii). Print total number of debit operations and total no of credit operations
* (iii). print individual debit operations and individual credit operations. */

	package shitalSDec19.homeworkQuestion;

	public class BankOperationsUsingConstructor {
	
		static int debitCnt;
		static int creditCnt;
		static int totalCnt;
		static int balance = 1000;

		BankOperationsUsingConstructor(int debit)
		{
			balance = balance - debit;
			debitCnt++;
			totalCnt++;
		}
		
			static void creditOperations(int credit) {
			int individualCreditCnt = 0;
			balance = balance + credit;
			creditCnt++;
			totalCnt++;
		}

		public static void main(String[] args) {
			BankOperationsUsingConstructor bankOperationsUsingConstructor = new BankOperationsUsingConstructor(200);
			creditOperations(500);
			BankOperationsUsingConstructor b1 = new BankOperationsUsingConstructor(1200);
			creditOperations(1500);
			creditOperations(3500);
			creditOperations(10000);
			BankOperationsUsingConstructor c1 = new BankOperationsUsingConstructor(200);
			// System.out.println(balance);
			System.out.println("Total no of debit operations are " + debitCnt);
			System.out.println("Total no of credit operations are " + creditCnt);
			System.out.println("Total no of debit and credit operations are " + totalCnt);
		}
	}

//}
