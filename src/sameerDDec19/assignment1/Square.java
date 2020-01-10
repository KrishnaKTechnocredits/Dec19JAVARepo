//import java.util.*;

/*
*
*Write a program to print the sum of squares of the elements of an array of size N. N can be any integer between 1 and 100. 1≤N≤100
*
*/
class Square
{	
	public static void main(String[] args)
	{
		//Scanner sc= new Scanner(System.in);
		
		//int n;
		
		//System.out.println("Enter Number");
		//n=sc.nextInt();
		
		
		int[] num=new int[4];
		//System.out.println("Enter the All Elements :");
		//for(int i=0;i<n;i++)
		//{
		//}
		num[0]=2;
		num[1]=3;
		num[2]=4;
		num[3]=5;
		Square s1=new Square();
		s1.AddSquare(num);
	}
	void AddSquare(int[] input)
	{
		int sum=0;
		for(int i=0;i<input.length;i++)
		{
			sum=sum+(input[i]*input[i]);
		}
		System.out.println("The Sum Is :"+sum);
	}

}