/*
 * WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class ReerseNumber {

	int setNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		scan.close();
		return num;
	}
	String reverseStr(int num)
	{
		String rev=" ";
		while(num > 0)
		{
			rev= rev +(String.valueOf(num %10));
			num=num/10;
		}
		return rev;
		
	}
	int reverseInt(int num)
	{
		int rev=0;
		while(num>0)
		{
			
			rev=rev*10;
			rev=rev +(num%10);
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		ReerseNumber r = new ReerseNumber();
		//String rev =r.reverseStr(r.setNum());
		int rev1=r.reverseInt(r.setNum());
		System.out.println("Reverse of entered number is :" + rev1);
	}
}
