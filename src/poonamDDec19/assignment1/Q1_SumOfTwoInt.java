package poonamDDec19.Assignment1;
/*
 *  Question1 - Write a program to print the sum of two integer
 */
public class Q1_SumOfTwoInt {
	void add(int x,int y)
		{
			int sum= x+y;
			System.out.println("Sum of "+x +" & "+y+" is: "+sum);		
		}
	public static void main(String[] args)
		{
			Q1_SumOfTwoInt ad= new Q1_SumOfTwoInt();
			ad.add(5,7);
		}

}
