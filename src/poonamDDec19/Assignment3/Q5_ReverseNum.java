package poonamDDec19.Assignment3;
/*
 * 5) WAP to reveres user given number 
 * a. Input number:- 456789 
 * b. Output number :- 987654 
 */
public class Q5_ReverseNum {
	public static void printRevNum(String num) {
		
		String rvnum = "";
		for(int i=num.length()-1;i>=0;i--)
			{
				rvnum = rvnum + num.charAt(i);
			}
				System.out.println("Reverse of given number: "+ rvnum);
	}
		public static void main(String[] args) {
			String n= "456789";
			printRevNum(n);
			
		}

}
