package ankitaPDec19.assignment1;
/*Write a program to print the sum of element’s squares of an array having size of N.*/

public class Question4 {
	public static void main(String [] args){
		int [] arr = {4,7,2,8,5};
		display(arr);
	}  
	
	
	public static void display(int [] arr){ 
		int [] square = new int[arr.length];
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			square[i] = arr[i] * arr[i];
			sum = sum + square[i];
		}
		System.out.println("The value of sum of square of element is :" + sum);
	}
}
	


