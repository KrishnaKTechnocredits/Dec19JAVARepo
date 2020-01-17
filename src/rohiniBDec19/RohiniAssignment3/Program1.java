package rohiniBDec19.RohiniAssignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		System.out.println("Enter Size of Array");
		Scanner sc =new Scanner(System.in);
		int size =sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter  Array elements");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("All Negative Elements are : "+Arrays.toString(printNegative(arr)));
		System.out.println("All Positive Elements are : "+Arrays.toString(printPositive(arr)));
		
		System.out.println("Sum of Negative Elements are : "+sumOfNegative(arr));
		System.out.println("Sum of Positive Elements are : "+sumOfPositive(arr));
	}

	private static int sumOfPositive(int[] arr) {
		int sum=0;
		for(int value : arr)
		{
			if(value>0) {
			sum+=value;
			}
		}
	
		return sum;
	}

	private static int sumOfNegative(int[] arr) {
		int sum=0;
		for(int value : arr)
		{
			if(value<0) {
			sum+=value;
			}
		}
	
		return sum;
	}

	private static int[] printNegative(int[] arr) {
      
		int[] temp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
				temp[i]=arr[i];
		}
		
		return temp;
	}

	private static int[] printPositive(int[] arr) {
      
		int[] temp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				temp[i]=arr[i];
		}
		
		return temp;
	}
	

}
