package poojaRDec19.Assignment3;

//4) WAP to find sum of user given number. a. Input:- 159753 b. Sum of given number:- 30 
import java.util.*;
public class Q4 {
	int m,sum,n;
	void sum()
	{
		System.out.println("Enter No  : ");
		Scanner s=new Scanner(System.in);
		n= s.nextInt();
		while(n>0)
		{
			m = n%10;
			sum = sum+m;
			n = n/10;
		}
		System.out.println("sum is "+sum);
		
		
	}

	public static void main(String[] args)
	{
		Q4 q4=new Q4();
		q4.sum();
	

	}

}
