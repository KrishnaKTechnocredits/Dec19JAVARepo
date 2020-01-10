package sairajJDec19.assignment2;

public class Question3 {
	
	void checkPresent(int[] a, int n) {
		boolean flag = true;
		for(int i =0; i<a.length;i++) {
			if(a[i] == n) {
				flag = false; 
			}
		}
		if(flag == true) {
			System.out.println( n + " not present in the array ");
		}else {
			System.out.println(n + " is present in the array ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 7, 4, 6};
		int number = 8;
		Question3 q1 = new Question3();
		q1.checkPresent(arr, number);
		
	}

}
