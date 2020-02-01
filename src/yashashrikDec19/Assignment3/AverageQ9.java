package yashashrikDec19.Assignment3;
/*9) WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16*/

import java.util.Scanner;

public class AverageQ9 {
	
	void displayAverage(int[] array)
	{
		int Sum=0;
		int[] temp1= new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			
				
				Sum=Sum+array[i];
				temp1[i]=array[i];
				//System.out.println(+temp1[i]);
			
		}
		double average=(double)Sum/array.length;
		System.out.println("Average of given input is: "+average);
		}

	public static void main(String[] args) {
		AverageQ9 q9=new AverageQ9();
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
		q9.displayAverage(array);
	}
	}
