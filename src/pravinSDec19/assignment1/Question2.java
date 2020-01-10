package pravinSDec19.assignment1;

/*
 * Created By: Pravin Sarda
 * Assignment 1 - Question 2
 * Write a program to print the sum of all the elements of an array of size 4.
 * 
 */

public class Question2 {

	int total(int array[]) {
		
		int plus=0;
		
		for(int i=0; i<4; i++) {
			
			plus = plus + array[i];
			
		}
		return plus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10,20,30,40};
		
		Question2 sum = new Question2();
		
		System.out.println("Sum all the elements of an array of size 4 is "+sum.total(array));

	}
}
