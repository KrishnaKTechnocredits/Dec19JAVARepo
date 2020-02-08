package praveenReddyDec19Assignment3;

import java.util.ArrayList;

/*
 WAP which fulfill below condition 
 a. WAP to find positive and negative number from the  given array   
 b. check the sum of individual. 
 
Input array;- {5, 6, -9, 14, -25, 6, 7, -14} 
Output :- expected output of 
a. positive number = {5, 6, 14, 6, 7} 
b. negative number = {-9, -25, -14} 
c. positive number sum :- 38 
d. negative number sum :- 48 
 
 */
public class PositiveNgativeSumQ1 {
	static void SumOfPositiveNegative(int[] a) {
		int sumofpositive = 0;
		int sumofnegative = 0;
		ArrayList<Integer> positiveNum = new ArrayList<Integer>();
		ArrayList<Integer> negativeNum = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++)
			if (a[i] > 0) {
				sumofpositive = sumofpositive + a[i];
				positiveNum.add(a[i]);
				// System.out.println("Sum of Positive Numbers" + sumofpositive[i]);
			}
			// System.out.println(sum);
			else

			{
				sumofnegative = sumofnegative + a[i];
				negativeNum.add(a[i]);
			}

		System.out.println("Positive numbers are : " + positiveNum);
		System.out.println("Negative numbers are : " + negativeNum);
		System.out.println("Sum of positive numbers is : " + sumofpositive);
		System.out.println("Sum of negative numbers is : " + sumofnegative);
	}

	public static void main(String[] args) {
		int a[] = { 5, 6, -9, 14, -25, 6, 7, -14 };
		PositiveNgativeSumQ1.SumOfPositiveNegative(a);

	}

}
