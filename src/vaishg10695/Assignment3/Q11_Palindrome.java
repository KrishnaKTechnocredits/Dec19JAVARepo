package vaishg10695.Assignment3;
import java.util.Scanner;
public class Q11_Palindrome {

	
	int FindPalindrome(int num) //121
	{
		int rev=0;
		while(num>0)		//121>0						12>0					1>0
		{
			rev=rev*10;		//rev=0*10 ie=0				rev=1*10 ie=10			rev=12*10 ie=120
		rev=rev +(num%10);	//rev=0+(121%10) i.e= 1		rev=10+(12%10) ie=12	rev=120+(1%10) ie=121
		num=num/10;			//num=121/10 i.e=12			num=12/10 ie=1			num=1/10 ie=0
		}
	return rev;
	 
	}
	public static void main(String[] args) {

		Q11_Palindrome p=new Q11_Palindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();	
		
		int rev=p.FindPalindrome(num);
		System.out.println("Reverse is :"+ rev);
		if(num == rev)
			System.out.println("Number is Palindrome!!");
		else
			System.out.println("Number is not Palindrome!!");

	}

}
