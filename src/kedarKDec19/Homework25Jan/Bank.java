package kedarKDec19.Homework25Jan;

public class Bank {
	/*
	 * Declaring instance variable
	 * 
	 */
	int Bankid;
	static int count =0;
	static int debtcount=0;
	static int credtcount=0;
	Bank(int id)
	{
		 Bankid =id ;
		 count++;
	}
/*
 * Method for Debit 
 */

	void debit()
	{
		System.out.println("Debited");
		debtcount++;
	}
	
	/*
	 * method for Credit
	 * 
	 */
	void credit()
	{
		System.out.println("Credited");
		credtcount++;
	}

	
	public static void main(String[] args) {
		Bank B=new Bank(123);		
	B.debit();
	B.credit();
	B.debit();
	Bank B1=new Bank(12345);
	B1.debit();
	B1.credit();
	B1.credit();
	Bank B2=new Bank(1234567);
	B2.debit();
	B2.credit();
	B2.debit();
	/*
	 * Total account details 
	 * 
	 */
	System.out.println("Total acc/Transcaton:"+count);
	System.out.println("Total debited:"+debtcount);
    System.out.println("Total Credited:"+credtcount);
	}

}
