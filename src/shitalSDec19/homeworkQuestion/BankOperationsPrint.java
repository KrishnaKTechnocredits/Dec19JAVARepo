package shitalSDec19.homeworkQuestion;

import java.util.Scanner;

public class BankOperationsPrint {
	static int debitCnt;
	static int creditCnt;
	static int totalCnt;
	static int balance = 1000;

	void debitOperations(int debit) {
		balance = balance - debit;
		debitCnt++;
		totalCnt++;
	}

	void creditOperations(int credit) {
		int individualCreditCnt = 0;
		balance = balance + credit;
		creditCnt++;
		totalCnt++;
	}

	public static void main(String[] args) {
		BankOperationsPrint bankOperationsPrint = new BankOperationsPrint();
		bankOperationsPrint.debitOperations(200);
		bankOperationsPrint.creditOperations(500);
		bankOperationsPrint.debitOperations(1200);
		bankOperationsPrint.creditOperations(1500);
		bankOperationsPrint.creditOperations(3500);
		bankOperationsPrint.creditOperations(10000);
		bankOperationsPrint.debitOperations(15000);
		// System.out.println(balance);
		System.out.println("Total no of debit operations are " + debitCnt);
		System.out.println("Total no of credit operations are " + creditCnt);
		System.out.println("Total no of debit and credit operations are " + totalCnt);
	}
}
