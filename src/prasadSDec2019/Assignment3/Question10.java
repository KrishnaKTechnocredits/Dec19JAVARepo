package prasadSDec2019.Assignment3;

//WAP to find Factorial series for user defined number 
//a. Input number :- 5 
//b. Output :- 120 

import java.util.Arrays;
import java.util.Scanner;

public class Question10 {
	
	void sumOfArray(int arr1[],int arr2[]) {
		int sum;
		int totOfFirstArray=0;
		int totOfSecondArray=0;
		for(int i=0;i<arr1.length;i++) {
			
			totOfFirstArray=totOfFirstArray+arr1[i];
			
		}
		System.out.println("First Array is: "+Arrays.toString(arr1));
		//System.out.println("Total sum in array1:"+totOfFirstArray);
		
		for(int i=0;i<arr2.length;i++) {
			totOfSecondArray=totOfSecondArray+arr2[i];
			
		}
		System.out.println("Second Array is: "+Arrays.toString(arr2));
		
		//System.out.println("Total sum in array2:"+totOfSecondArray);
		
		sum=totOfFirstArray+totOfSecondArray;
		System.out.println("Sum Of Both array is: "+sum);
		
		
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number in first array:");
		int num1=scn.nextInt();
		int arr1[]=new int[num1];
		System.out.println("First array:");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scn.nextInt();
		}
		System.out.println("Enter the numbers in 2nd array:");
		
		int num2=scn.nextInt();
		int arr2[]=new int[num2];
		System.out.println("secound array:");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scn.nextInt();
		}
		
		Question10 q10=new Question10();
		q10.sumOfArray(arr1, arr2);
		
	}
}
