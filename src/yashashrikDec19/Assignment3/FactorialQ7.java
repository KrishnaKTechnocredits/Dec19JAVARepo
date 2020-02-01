package yashashrikDec19.Assignment3;
/*7) WAP to find Factorial series for user defined number
a. Input number :- 5
b. Output :- 120*/
import java.util.Scanner;

public class FactorialQ7 {

	
	void displayFactorial(int num)
	{
		int fact=1;
		for(int i=num;num>0;num--)
		{
			
			fact=fact*num;

		}
		System.out.println("Factorial of given num is: "+fact);
	}
	public static void main(String[] args) {
		FactorialQ7 q7=new FactorialQ7();
		System.out.println("Enter number you want factorial for: ");
		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		
		q7.displayFactorial(num);
	}
}
