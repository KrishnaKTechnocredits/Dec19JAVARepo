package ankitaPDec19.assignment1;
/* Write a program to print the sum of all the elements of an array of size 4.*/

public class Question2 {
	
	static void add(int [] a)
	{
		int sum = 0;
		for(int i =0; i <= a.length-1; i++)
		{
			sum = sum + a[i] ;
			
		}
		System.out.println(sum);
	}
	
	public static void main(String [] args)
	{
		int [] a = new int [4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		Question2.add(a);
	}
	
} 



	    
