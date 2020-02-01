package yashashrikDec19.Assignment3;
/*5) WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654*/
import java.util.Scanner;

public class ReverseQ5 {
	
	void displayReverse(String num)
	{
		int input=0;
		for(int i=num.length()-1;i>=0;i--)
		{
		//System.out.println("length"+num.length());
		input=Integer.parseInt(String.valueOf(num.charAt(i)));
		System.out.print(input);
			
		}
		
	}

	public static void main(String[] args) {
		ReverseQ5 q5=new ReverseQ5();
		String s;
		System.out.println("Enter number to be reversed");
		Scanner s1=new Scanner(System.in);
		s=s1.nextLine();
		q5.displayReverse(s);
	}
}
