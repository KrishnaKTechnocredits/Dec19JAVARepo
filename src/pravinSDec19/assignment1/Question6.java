package pravinSDec19.assignment1;

/*
 * Created By: Pravin Sarda
 * Assignment 1 - Question 6
 	Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 1 <=N <=100
	Hint:
	Input: int input1[] = {3, 9, 8,}
	int input1[] = {8, 12, 74}
	Output: 11 21 82
 * 
 */
import java.util.Arrays;

public class Question6 {

	int[] total(int array1[],int array2[]) {
		
		int plus[] = new int[array1.length];
		
		for(int i=0; i<array1.length; i++) {
			
			plus[i] = array1[i] + array2[i];
			
		}
		return plus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = {3,9,8};
		int array2[] = {8,12,74};
		
		Question6 sum = new Question6();
	
		System.out.println("Sum corresponding elements of two arrays is "+Arrays.toString(sum.total(array1, array2)));

	}
}
