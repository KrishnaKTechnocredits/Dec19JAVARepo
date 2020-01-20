package pravinSDec19.assignment1;

/*
 * Created By: Pravin Sarda
 * Assignment 1 - Question 4
 * Write a program to print the sum of element’s squares of an array having size of N.
	Hint:
	Input: int[] array = 4 7 2 8 5
	Output: 158
 * 
 */

public class Question4 {

	int total(int array[]) {
		
		int plus=0;
		
		for(int i=0; i<array.length; i++) {
			
			plus = plus + array[i];
			
		}
		return plus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {6,3,8};
		
		Question4 sum = new Question4();
		
		System.out.println("Sum all the elements of an array of size "+ array.length +" is "+sum.total(array));

	}
}
