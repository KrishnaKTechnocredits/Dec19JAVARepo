package yashashrikDec19.Assignment3;
/*10)WAP to sum of two array
a. firstArray :- {1, 5, 9, 3, 7}
b. secondAraay:- {1, 7, 9, 3}
c. output :- 45*/
import java.util.Scanner;

public class SumOfTwoArrayQ10 {
	void displaySum(int[] a1,int[] a2)
	{
		int sum=0;
		for(int i=0;i<a1.length ;i++)
		{
			sum=sum+(a1[i]+a2[i]);
		}
		System.out.println("Sum of two array is: "+sum);
	}
	public static void main(String[] args) {
		SumOfTwoArrayQ10 q10=new SumOfTwoArrayQ10();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s1.nextInt();
		int[] array1=new int[size];
		int[] array2=new int[size];
		System.out.println("Enter numbers for array 1 :");
		for(int i=0;i<array1.length;i++)
		{
			
			array1[i]=s1.nextInt();
			//sum(array);
		}
		System.out.println("Enter numbers for array 2 :");
		for(int i=0;i<array2.length;i++)
		{
			
			array2[i]=s1.nextInt();
			//sum(array);
		}
		q10.displaySum(array1,array2);

	}
	
}
