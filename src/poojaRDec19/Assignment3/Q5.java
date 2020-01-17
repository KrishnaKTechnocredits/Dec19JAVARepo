package poojaRDec19.Assignment3;
//5) WAP to reveres user given number a. Input number:- 456789 b. Output number :- 987654 
import java.util.*;
public class Q5 
{
	int m,rev,n;
	void reverse()
	{
		System.out.println("Enter No  : ");
		Scanner s=new Scanner(System.in);
		n= s.nextInt();
		while(n>0)
		{
			rev=rev*10;
			rev=rev+(n%10);
			n=n/10;
		}
		System.out.println("reverse no  : "+rev);
			
		}

	public static void main(String[] args) 
	{
	Q5 q5=new Q5();
	q5.reverse();

	}

}
