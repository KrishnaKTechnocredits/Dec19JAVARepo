package sairajJDec19.assignment2;

public class Question13 {

	void printReverse(int[]a) {
		for(int i =a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
			int [] arr = {5,6,9,10,14,63};
			Question13 q1 = new Question13();
			q1.printReverse(arr);
	}
}
