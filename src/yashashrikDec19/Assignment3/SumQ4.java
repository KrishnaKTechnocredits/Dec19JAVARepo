package yashashrikDec19.Assignment3;
/*4) WAP to find sum of user given number.
a. Input:- 159753
b. Sum of given number:- 30*/
import java.util.Scanner;

public class SumQ4 {

	void displaySum(String num)
	{
		int temp=0;
		int sum=0;
		for(int i=0;i<num.length();i++)
		{
			//System.out.println(num.length());
			temp+=Integer.parseInt(String.valueOf(num.charAt(i)));
			
		}
		System.out.println("Sum of given numbers is : "+temp);
	}
	public static void main(String[] args) {
		SumQ4 q4=new SumQ4();
		String s;
		System.out.println("Enter Number you want addition for:");
		Scanner s1=new Scanner(System.in);
		s=s1.nextLine();
	//int num=Integer.parseInt(s);
	q4.displaySum(s);	
	}
}
