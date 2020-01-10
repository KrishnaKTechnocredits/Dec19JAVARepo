package pravinSDec19.assignment1;
/*
 * Created By: Pravin Sarda
 * Assignment 1 - Question 3
 * Write a program to print the sum of all the element of an array of size having N.
 * 
 */
public class Question3 {

	int total(int array[]) {
		
		int plus=0;
		
		for(int i=0; i<array.length; i++) {
			
			plus = plus + (array[i] * array[i]);
			
		}
		return plus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {6,3,8};
		
		Question3 sum = new Question3();
		
		System.out.println("Sum all the elements of an array of size "+ array.length +" is "+sum.total(array));

	}
}
