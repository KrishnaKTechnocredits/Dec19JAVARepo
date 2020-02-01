package yashashrikDec19.Assignment3;
/*1) WAP which fulfill below condition
a. WAP to find positive and negative number from the given array
b. check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48
*/

import java.util.Scanner;

public class PosNegQ1 {
	static void sum(int[] num)
	{
		int posSum=0;
		int negSum=0;
		
		int[] temp1= new int[num.length];
		int[] temp2= new int[num.length];
		System.out.println("Positive Numbers");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>0) 
			{
				
				posSum=posSum+num[i];
				temp1[i]=num[i];
				System.out.println(+num[i]);
				
			}
			
		}
		System.out.println("Negavtive Numbers");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0) 
			{
				
				negSum=negSum+num[i];
				temp1[i]=num[i];
				System.out.println(+num[i]);
				
			}
			
			
		}
		
		//System.out.println("Positive Numbers" +temp1);
		//System.out.println("Negavtive Numbers" +temp1);
		System.out.println("Addition of Negative Numbers"+negSum);
		System.out.println("Addition of Positive Numbers"+posSum);
		
	}
	public static void main(String[] args) {
		//PosNegQ1 q1=new PosNegQ1();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s1.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter numbers:");
			array[i]=s1.nextInt();
			//sum(array);
		}
		sum(array);
	}

}
