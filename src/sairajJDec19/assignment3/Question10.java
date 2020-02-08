package sairajJDec19.assignment3;

public class Question10 {
	
	int getSum(int[]a, int[]b) {
		int arraySum=0;
		for(int i=0; i<a.length; i++) {
			for(int j =0; j<b.length; j++)
				if(a[i]==b[j]) {
					arraySum = arraySum + a[i]+b[j];
				}	
		}
		return arraySum;
	}
	public static void main(String[] args) {
		int[] a = {1,5,9,3,7};
		int[] b = {1,7,9,3};
		Question10 q1 = new Question10();
		System.out.println("Sum of two arrays is : "+q1.getSum(a, b));
	}

}
