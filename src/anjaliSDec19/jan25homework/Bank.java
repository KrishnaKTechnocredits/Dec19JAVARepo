package anjaliSDec19.jan25homework;


public class Bank {
	/*
	 * Total db, total cr, total ind cr, total ind db, total no of obj created
	 */
		static int tdb=0; 
		static int tcr=0;
		static int cnt =0;
		int dbcnt=0, crcnt=0;
		void debit()
		{
			//System.out.println("Debit");
			tdb++;
			dbcnt++;
		}
		void credit()
		{
			//System.out.println("Credit");
			tcr++;
			crcnt++;
		}
		public Bank(int acc_no)
		{
			//System.out.println("Acc_no is "+acc_no);
			cnt++;
		}
		public static void main(String[] args) {
			
			Bank bnk1= new Bank(123456);
			Bank bnk2= new Bank(654123);
			Bank bnk3= new Bank(654321);
			Bank bnk4= new Bank(456789);
			bnk1.credit();
			bnk2.credit();
			bnk2.credit();
			bnk3.credit();
			bnk1.debit();
			bnk3.debit();
			bnk3.debit();
			System.out.println("Total number of objects : "+cnt);
			System.out.println("Total number of Debits : "+tdb);
			System.out.println("Total number of Credits : "+tcr);
			System.out.println("Total number of Debits of bnk1: "+bnk1.dbcnt);
			System.out.println("Total number of Debits of bnk2: "+bnk2.dbcnt);
			System.out.println("Total number of Debits of bnk3: "+bnk3.dbcnt);
			System.out.println("Total number of Credits of bnk1: "+bnk1.crcnt);
			System.out.println("Total number of Credits of bnk2: "+bnk2.crcnt);
			System.out.println("Total number of Credits of bnk3: "+bnk3.crcnt);
		}
}
